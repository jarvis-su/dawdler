## Jars install
mvn install:install-file -Dfile=D:\bin\btrace-bin-1.3.8.3\build\btrace-agent.jar -DgroupId=com.sun.tools.btrace -DartifactId=btrace-agent -Dversion=1.3.8.3 -Dpackaging=jar

mvn install:install-file -Dfile=D:\bin\btrace-bin-1.3.8.3\build\btrace-client.jar -DgroupId=com.sun.tools.btrace -DartifactId=btrace-client -Dversion=1.3.8.3 -Dpackaging=jar

mvn install:install-file -Dfile=D:\bin\btrace-bin-1.3.8.3\build\btrace-boot.jar -DgroupId=com.sun.tools.btrace -DartifactId=btrace-boot -Dversion=1.3.8.3 -Dpackaging=jar


## Btrac 一些支持的参数:

    bootClassPath - 启动classpath
    systemClassPath - 系统classpath
    debug - 是否打开调试信息(true/false)
    unsafe - 是否开启btrace限制约束(true/false) // 我设置为true貌似无效
    dumpClasses - 是否dump被trace的目标二进制代码 (true/false)
    dumpDir - 指定dump文件路径
    stdout - 是否重定向btrace输出到标准输出(true/false)
    probeDescPath - 指定trace点的描述 XML文件路径
    script - 指定btrace agent启动时的运行的脚本
    scriptdir - 指定btrace agent启动时要运行的脚本所在文件夹
    scriptOutputFile - btrace agent输出文件代理地址 
