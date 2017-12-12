#!/usr/bin/env sh

curl -vvv --data "{ \"header\": { \"alg\": \"HS256\" }, \
    \"signature\": \"eyAKICAgICAgICAiYWxnIjogIlJTMjU2IgogICAgfQ==\" }, \
    \"protected\": \"eyAKICAgICAgICAiYWxnIjogIlJTMjU2IgogICAgfQ==\", \
    \"payload\": \"eyAidmFsMSI6ICJ1biIsICJ2YWwyIjogIjIiIH0=\" }" \
    -H "Content-Type: application/json" \
    "http://localhost:13000/jaxrs-service/hello/jsonBean"
