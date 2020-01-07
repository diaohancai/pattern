Changes with nginx 1.12.2                                        17 Oct 2017

    *) Bugfix: client SSL connections were immediately closed if deferred
       accept and the "proxy_protocol" parameter of the "listen" directive
       were used.

    *) Bugfix: client connections might be dropped during configuration
       testing when using the "reuseport" parameter of the "listen"
       directive on Linux.

    *) Bugfix: incorrect response length was returned on 32-bit platforms
       when requesting more than 4 gigabytes with multiple ranges.

    *) Bugfix: switching to the next upstream server in the stream module
       did not work when using the "ssl_preread" directive.

    *) Bugfix: when using HTTP/2 client request body might be corrupted.

    *) Bugfix: in handling of client addresses when using unix domain
       sockets.


Changes with nginx 1.12.1                                        11 Jul 2017

    *) Security: a specially crafted request might result in an integer
       overflow and incorrect processing of ranges in the range filter,
       potentially resulting in sensitive information leak (CVE-2017-7529).


Changes with nginx 1.12.0                                        12 Apr 2017

    *) 1.12.x stable branch.


Changes with nginx 1.11.13                                       04 Apr 2017

    *) Feature: the "http_429" parameter of the "proxy_next_upstream",
       "fastcgi_next_upstream", "scgi_next_upstream", and
       "uwsgi_next_upstream" directives.
       Thanks to Piotr Sikora.

    *) Bugfix: in memory allocation error handling.

    *) Bugfix: requests might hang when using the "sendfile" and
       "timer_resolution" directives on Linux.

    *) Bugfix: requests might hang when using the "sendfile" and "aio_write"
       directives with subrequests.

    *) Bugfix: in the ngx_http_v2_module.
       Thanks to Piotr Sikora.

    *) Bugfix: a segmentation fault might occur in a worker process when
       using HTTP/2.

    *) Bugfix: requests might hang when using the "limit_rate",
       "sendfile_max_chunk", "limit_req" directives, or the $r->sleep()
       embedded perl method with subrequests.

    *) Bugfix: in the ngx_http_slice_module.


Changes with nginx 1.11.12                                       24 Mar 2017

    *) Bugfix: nginx might hog CPU; the bug had appeared in 1.11.11.


Changes with nginx 1.11.11                                       21 Mar 2017

    *) Feature: the "worker_shutdown_timeout" directive.

    *) Feature: vim syntax highlighting scripts improvements.
       Thanks to Wei-Ko Kao.

    *) Bugfix: a segmentation fault might occur in a worker process if the
       $limit_rate variable was set to an empty string.

    *) Bugfix: the "proxy_cache_background_update",
       "fastcgi_cache_background_update", "scgi_cache_background_update",
       and "uwsgi_cache_background_update" directives might work incorrectly
       if the "if" directive was used.

    *) Bugfix: a segmentation fault might occur in a worker process if
       number of large_client_header_buffers in a virtual server was
       different from the one in the default server.

    *) Bugfix: in the mail proxy server.

