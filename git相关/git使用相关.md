# git多账户配置
- https://www.jianshu.com/p/d483b227be83
    - https模式和ssh模式
    - 建议了https模式,以及https模式的秘钥保存命令
- https://www.jianshu.com/p/fb958419ea34
    - ssh模式多账户

# git计算代码行数
```
git log  --since=2023-02-23 --until=2023-02-24 --author="$(git config --get user.name)" --pretty=tformat: --numstat | gawk '{ add += $1 ; subs += $2 ; loc += $1 - $2 } END { printf "added lines: %s removed lines : %s total lines: %s\n",add,subs,loc }'
```