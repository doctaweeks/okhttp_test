This is a small test for the okhttp+nginx http/2 bug described by [nginx ticket
1397](https://trac.nginx.org/nginx/ticket/1397).

Usage:

1. Place libraries for testing (okio, okhttp) in local directory
2. Adjust Makefile variables
3. make build
4. make test

An older, unpatched okhttp library will return "Expected ':status' header not
present" rather than the actual page.

Caution:

On some systems this check may default to http/1.x and give false results.
Ensure it actually used http/2 to verify the test result (in server logs, etc).
