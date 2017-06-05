# web-framework-performance-test

主流Java框架的性能测试

## usage

```bash
bash run.sh spring-boot
bash run.sh blade2
bash run.sh jfinal
```

## stop

```bash
ctrl(command)+c
```

## test

```bash
wrk -t16 -c1000 -d30s http://127.0.0.1:8080/hello
wrk -t100 -c1000 -d30s http://127.0.0.1:8080/hello
wrk -t200 -c1000 -d30s http://127.0.0.1:8080/hello
```