FROM mysql:8
COPY *.sql /docker-entrypoint-initdb.d/
ADD scripts/1_init.sql /docker-entrypoint-initdb.d
RUN chmod a+r /docker-entrypoint-initdb.d/*
