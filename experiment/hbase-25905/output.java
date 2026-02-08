JUnit version 4.13
Formatting using clusterid: testClusterID
Process Thread Dump: Thread dump because: Master not active after 30000ms
171 active threads
Thread 302 (master:store-WAL-Roller):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 90
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hbase.wal.AbstractWALRoller.run(AbstractWALRoller.java:162)
Thread 301 (Idle-Rpc-Conn-Sweeper-pool-0):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 291 (process reaper):
  State: TIMED_WAITING
  Blocked count: 1
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
    java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:362)
    java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:941)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1073)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 287 (LeaseRenewer:sebastiaoamaro@localhost:43125):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 22
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.client.impl.LeaseRenewer.run(LeaseRenewer.java:411)
    org.apache.hadoop.hdfs.client.impl.LeaseRenewer.access$600(LeaseRenewer.java:76)
    org.apache.hadoop.hdfs.client.impl.LeaseRenewer$1.run(LeaseRenewer.java:307)
    java.lang.Thread.run(Thread.java:750)
Thread 285 (org.apache.hadoop.hdfs.PeerCache@582940ad):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 8
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.PeerCache.run(PeerCache.java:253)
    org.apache.hadoop.hdfs.PeerCache.access$000(PeerCache.java:46)
    org.apache.hadoop.hdfs.PeerCache$1.run(PeerCache.java:124)
    java.lang.Thread.run(Thread.java:750)
Thread 283 (IPC Client (175795611) connection to localhost/127.0.0.1:43125 from sebastiaoamaro):
  State: TIMED_WAITING
  Blocked count: 61
  Waited count: 62
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.ipc.Client$Connection.waitForWork(Client.java:1024)
    org.apache.hadoop.ipc.Client$Connection.run(Client.java:1068)
Thread 282 (master/sebastiaolaptop:0:becomeActiveMaster-MemStoreChunkPool Statistics):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 280 (master/sebastiaolaptop:0:becomeActiveMaster-MemStoreChunkPool Statistics):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 278 (Monitor thread for TaskMonitor):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 3
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hbase.monitoring.TaskMonitor$MonitorRunnable.run(TaskMonitor.java:308)
    java.lang.Thread.run(Thread.java:750)
Thread 277 (qtp336437983-277):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 276 (qtp336437983-276-acceptor-0@4cd2b473-ServerConnector@1aca4e2e{HTTP/1.1, (http/1.1)}{0.0.0.0:35477}):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:388)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:702)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 275 (qtp336437983-275):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 274 (qtp336437983-274):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 273 (qtp336437983-273):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 272 (qtp336437983-272):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 271 (qtp336437983-271):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 270 (qtp336437983-270):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 268 (master/sebastiaolaptop:0:becomeActiveMaster):
  State: RUNNABLE
  Blocked count: 77
  Waited count: 141
  Stack:
    java.io.UnixFileSystem.canonicalize0(Native Method)
    java.io.UnixFileSystem.canonicalize(UnixFileSystem.java:177)
    java.io.File.getCanonicalPath(File.java:626)
    java.io.FilePermission$1.run(FilePermission.java:248)
    java.io.FilePermission$1.run(FilePermission.java:236)
    java.security.AccessController.doPrivileged(Native Method)
    java.io.FilePermission.init(FilePermission.java:236)
    java.io.FilePermission.<init>(FilePermission.java:310)
    java.lang.SecurityManager.checkRead(SecurityManager.java:888)
    java.io.File.exists(File.java:825)
    sun.misc.URLClassPath$FileLoader.getResource(URLClassPath.java:1391)
    sun.misc.URLClassPath.getResource(URLClassPath.java:250)
    java.net.URLClassLoader$1.run(URLClassLoader.java:366)
    java.net.URLClassLoader$1.run(URLClassLoader.java:363)
    java.security.AccessController.doPrivileged(Native Method)
    java.net.URLClassLoader.findClass(URLClassLoader.java:362)
    java.lang.ClassLoader.loadClass(ClassLoader.java:418)
    sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:352)
    java.lang.ClassLoader.loadClass(ClassLoader.java:351)
    org.apache.hadoop.hbase.io.asyncfs.FanOutOneBlockAsyncDFSOutputHelper.connectToDataNodes(FanOutOneBlockAsyncDFSOutputHelper.java:405)
Thread 236 (M:0;sebastiaolaptop:39871):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 301
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hbase.util.Sleeper.sleep(Sleeper.java:84)
    org.apache.hadoop.hbase.util.Sleeper.sleep(Sleeper.java:67)
    org.apache.hadoop.hbase.master.HMaster.run(HMaster.java:556)
    java.lang.Thread.run(Thread.java:750)
Thread 266 (RpcServer.metaPriority.FPBQ.Fifo.handler=0,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@6623f363
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 265 (RpcServer.replication.FPBQ.Fifo.handler=2,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@2c8b7e8d
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 264 (RpcServer.replication.FPBQ.Fifo.handler=1,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@1c904cfa
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 263 (RpcServer.replication.FPBQ.Fifo.handler=0,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@b15a37e
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 262 (RpcServer.priority.RWQ.Fifo.read.handler=2,queue=1,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@7254f194
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 261 (RpcServer.priority.RWQ.Fifo.read.handler=1,queue=1,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@7254f194
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 260 (RpcServer.priority.RWQ.Fifo.write.handler=0,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@5dc8645
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 259 (RpcServer.default.FPBQ.Fifo.handler=2,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@1b35ed98
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 258 (RpcServer.default.FPBQ.Fifo.handler=1,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@3d9db3d3
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 257 (RpcServer.default.FPBQ.Fifo.handler=0,queue=0,port=39849):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@68102da5
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 256 (MobFileCache #0):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 254 (LruBlockCacheStatsExecutor):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 252 (Time-limited test.LruBlockCache.EvictionThread):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 4
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hbase.io.hfile.LruBlockCache$EvictionThread.run(LruBlockCache.java:937)
Thread 251 (Session-HouseKeeper-14832582-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 250 (qtp528438477-250):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 249 (qtp528438477-249):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 248 (qtp528438477-248):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 247 (qtp528438477-247):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 246 (qtp528438477-246):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 245 (qtp528438477-245):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 244 (qtp528438477-244-acceptor-0@32de3969-ServerConnector@21bf5320{HTTP/1.1, (http/1.1)}{0.0.0.0:37401}):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:388)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:702)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 243 (qtp528438477-243):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 242 (zk-event-processor-pool-0):
  State: WAITING
  Blocked count: 6
  Waited count: 11
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@5b2bc596
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 240 (Time-limited test-EventThread):
  State: WAITING
  Blocked count: 0
  Waited count: 7
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@3fba61b5
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:506)
Thread 239 (Time-limited test-SendThread(127.0.0.1:63276)):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    org.apache.zookeeper.ClientCnxnSocketNIO.doTransport(ClientCnxnSocketNIO.java:345)
    org.apache.zookeeper.ClientCnxn$SendThread.run(ClientCnxn.java:1223)
Thread 238 (MiniHBaseClusterRegionServer-EventLoopGroup-4-1):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    org.apache.hbase.thirdparty.io.netty.channel.epoll.Native.epollWait(Native Method)
    org.apache.hbase.thirdparty.io.netty.channel.epoll.Native.epollWait(Native.java:192)
    org.apache.hbase.thirdparty.io.netty.channel.epoll.Native.epollWait(Native.java:185)
    org.apache.hbase.thirdparty.io.netty.channel.epoll.EpollEventLoop.epollWaitNoTimerChange(EpollEventLoop.java:290)
    org.apache.hbase.thirdparty.io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:347)
    org.apache.hbase.thirdparty.io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
    org.apache.hbase.thirdparty.io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
    org.apache.hbase.thirdparty.io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
    java.lang.Thread.run(Thread.java:750)
Thread 235 (RpcServer.metaPriority.FPBQ.Fifo.handler=0,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@11dd20d5
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 234 (RpcServer.replication.FPBQ.Fifo.handler=2,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@31b5287e
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 233 (RpcServer.replication.FPBQ.Fifo.handler=1,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@34b75cab
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 232 (RpcServer.replication.FPBQ.Fifo.handler=0,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@586c2441
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 231 (RpcServer.priority.RWQ.Fifo.read.handler=2,queue=1,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@20cf7c11
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 230 (RpcServer.priority.RWQ.Fifo.read.handler=1,queue=1,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@20cf7c11
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 229 (RpcServer.priority.RWQ.Fifo.write.handler=0,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@38a156ae
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.getCallRunner(RpcExecutor.java:325)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 228 (RpcServer.default.FPBQ.Fifo.handler=2,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@367d1715
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 227 (RpcServer.default.FPBQ.Fifo.handler=1,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@f0a73b7
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 226 (RpcServer.default.FPBQ.Fifo.handler=0,queue=0,port=39871):
  State: WAITING
  Blocked count: 0
  Waited count: 1
  Waiting on java.util.concurrent.Semaphore$NonfairSync@547ea9b3
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
    java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
    java.util.concurrent.Semaphore.acquire(Semaphore.java:312)
    org.apache.hadoop.hbase.ipc.FastPathBalancedQueueRpcExecutor$FastPathHandler.getCallRunner(FastPathBalancedQueueRpcExecutor.java:109)
    org.apache.hadoop.hbase.ipc.RpcExecutor$Handler.run(RpcExecutor.java:334)
Thread 225 (Session-HouseKeeper-25c1f8c6-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 224 (qtp1333678798-224):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 223 (qtp1333678798-223):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 222 (qtp1333678798-222):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 221 (qtp1333678798-221):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 220 (qtp1333678798-220):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 219 (qtp1333678798-219):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:382)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.idleJobPoll(QueuedThreadPool.java:973)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1023)
    java.lang.Thread.run(Thread.java:750)
Thread 218 (qtp1333678798-218-acceptor-0@435ae347-ServerConnector@73757690{HTTP/1.1, (http/1.1)}{0.0.0.0:46777}):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:388)
    org.apache.hbase.thirdparty.org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:702)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 217 (qtp1333678798-217):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.nioSelect(ManagedSelector.java:183)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector.select(ManagedSelector.java:190)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:606)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:543)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:360)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:184)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:171)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:135)
    org.apache.hbase.thirdparty.org.eclipse.jetty.io.ManagedSelector$$Lambda$109/344158696.run(Unknown Source)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:882)
    org.apache.hbase.thirdparty.org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1036)
    java.lang.Thread.run(Thread.java:750)
Thread 215 (NIOWorkerThread-24):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 214 (NIOWorkerThread-23):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 213 (NIOWorkerThread-22):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 212 (NIOWorkerThread-21):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 211 (NIOWorkerThread-20):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 210 (NIOWorkerThread-19):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 209 (NIOWorkerThread-18):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 208 (NIOWorkerThread-17):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 207 (NIOWorkerThread-16):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 206 (NIOWorkerThread-15):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 205 (NIOWorkerThread-14):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 204 (NIOWorkerThread-13):
  State: WAITING
  Blocked count: 0
  Waited count: 4
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 203 (NIOWorkerThread-12):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 202 (NIOWorkerThread-11):
  State: WAITING
  Blocked count: 1
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 201 (NIOWorkerThread-10):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 200 (NIOWorkerThread-9):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 199 (NIOWorkerThread-8):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 198 (NIOWorkerThread-7):
  State: WAITING
  Blocked count: 0
  Waited count: 6
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 197 (NIOWorkerThread-6):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 196 (NIOWorkerThread-5):
  State: WAITING
  Blocked count: 0
  Waited count: 6
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 195 (NIOWorkerThread-4):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 194 (zk-event-processor-pool-0):
  State: WAITING
  Blocked count: 7
  Waited count: 10
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@6408aca1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 193 (NIOWorkerThread-3):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 192 (NIOWorkerThread-2):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 191 (Time-limited test-EventThread):
  State: WAITING
  Blocked count: 0
  Waited count: 7
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@459aa2a2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:506)
Thread 190 (Time-limited test-SendThread(127.0.0.1:63276)):
  State: RUNNABLE
  Blocked count: 6
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    org.apache.zookeeper.ClientCnxnSocketNIO.doTransport(ClientCnxnSocketNIO.java:345)
    org.apache.zookeeper.ClientCnxn$SendThread.run(ClientCnxn.java:1223)
Thread 189 (NettyRpcServer-3-1):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hbase.thirdparty.io.netty.channel.nio.SelectedSelectionKeySetSelector.select(SelectedSelectionKeySetSelector.java:68)
    org.apache.hbase.thirdparty.io.netty.channel.nio.NioEventLoop.select(NioEventLoop.java:810)
    org.apache.hbase.thirdparty.io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:457)
    org.apache.hbase.thirdparty.io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
    org.apache.hbase.thirdparty.io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
    org.apache.hbase.thirdparty.io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
    java.lang.Thread.run(Thread.java:750)
Thread 188 (HBase-Metrics2-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 17
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 176 (IPC Client (175795611) connection to localhost/127.0.0.1:43125 from sebastiaoamaro):
  State: TIMED_WAITING
  Blocked count: 112
  Waited count: 113
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.ipc.Client$Connection.waitForWork(Client.java:1024)
    org.apache.hadoop.ipc.Client$Connection.run(Client.java:1068)
Thread 175 (java.util.concurrent.ThreadPoolExecutor$Worker@3196d3cc[State = -1, empty queue]):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 165 (refreshUsed-/home/sebastiaoamaro/phd/rw/Anduril/experiment/hbase-25905/target/test-data/173b4136-7a77-230a-bc82-067277bff004/cluster_88cc44d1-63be-9eb1-ce03-2ddcc638417c/dfs/data/data1/current/BP-452916421-127.0.1.1-1733171263233):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.fs.CachingGetSpaceUsed$RefreshThread.run(CachingGetSpaceUsed.java:179)
    java.lang.Thread.run(Thread.java:750)
Thread 164 (refreshUsed-/home/sebastiaoamaro/phd/rw/Anduril/experiment/hbase-25905/target/test-data/173b4136-7a77-230a-bc82-067277bff004/cluster_88cc44d1-63be-9eb1-ce03-2ddcc638417c/dfs/data/data2/current/BP-452916421-127.0.1.1-1733171263233):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.fs.CachingGetSpaceUsed$RefreshThread.run(CachingGetSpaceUsed.java:179)
    java.lang.Thread.run(Thread.java:750)
Thread 158 (pool-10-thread-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 156 (VolumeScannerThread(/home/sebastiaoamaro/phd/rw/Anduril/experiment/hbase-25905/target/test-data/173b4136-7a77-230a-bc82-067277bff004/cluster_88cc44d1-63be-9eb1-ce03-2ddcc638417c/dfs/data/data2)):
  State: TIMED_WAITING
  Blocked count: 9
  Waited count: 2
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hdfs.server.datanode.VolumeScanner.run(VolumeScanner.java:626)
Thread 155 (VolumeScannerThread(/home/sebastiaoamaro/phd/rw/Anduril/experiment/hbase-25905/target/test-data/173b4136-7a77-230a-bc82-067277bff004/cluster_88cc44d1-63be-9eb1-ce03-2ddcc638417c/dfs/data/data1)):
  State: TIMED_WAITING
  Blocked count: 12
  Waited count: 2
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hdfs.server.datanode.VolumeScanner.run(VolumeScanner.java:626)
Thread 151 (IPC Parameter Sending Thread #0):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 185
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
    java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:362)
    java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:941)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1073)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 149 (IPC Server handler 4 on 38997):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 378
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 148 (IPC Server handler 3 on 38997):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 377
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 147 (IPC Server handler 2 on 38997):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 378
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 146 (IPC Server handler 1 on 38997):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 378
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 145 (IPC Server handler 0 on 38997):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 377
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 137 (IPC Server listener on 38997):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hadoop.ipc.Server$Listener.run(Server.java:1155)
Thread 140 (IPC Server Responder):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    org.apache.hadoop.ipc.Server$Responder.doRunLoop(Server.java:1330)
    org.apache.hadoop.ipc.Server$Responder.run(Server.java:1313)
Thread 80 (org.apache.hadoop.hdfs.server.datanode.DataXceiverServer@8cef0ca):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    sun.nio.ch.ServerSocketAdaptor.accept(ServerSocketAdaptor.java:113)
    org.apache.hadoop.hdfs.net.TcpPeerServer.accept(TcpPeerServer.java:85)
    org.apache.hadoop.hdfs.server.datanode.DataXceiverServer.run(DataXceiverServer.java:145)
    java.lang.Thread.run(Thread.java:750)
Thread 144 (pool-13-thread-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 143 (BP-452916421-127.0.1.1-1733171263233 heartbeating to localhost/127.0.0.1:43125):
  State: TIMED_WAITING
  Blocked count: 128
  Waited count: 345
  Stack:
    java.lang.Object.wait(Native Method)
    org.apache.hadoop.hdfs.server.datanode.IncrementalBlockReportManager.waitTillNextIBR(IncrementalBlockReportManager.java:158)
    org.apache.hadoop.hdfs.server.datanode.BPServiceActor.offerService(BPServiceActor.java:715)
    org.apache.hadoop.hdfs.server.datanode.BPServiceActor.run(BPServiceActor.java:842)
    java.lang.Thread.run(Thread.java:750)
Thread 139 (IPC Server idle connection scanner for port 38997):
  State: TIMED_WAITING
  Blocked count: 1
  Waited count: 39
  Stack:
    java.lang.Object.wait(Native Method)
    java.util.TimerThread.mainLoop(Timer.java:552)
    java.util.TimerThread.run(Timer.java:505)
Thread 138 (Socket Reader #1 for port 38997):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hadoop.ipc.Server$Listener$Reader.doRunLoop(Server.java:1093)
    org.apache.hadoop.ipc.Server$Listener$Reader.run(Server.java:1072)
Thread 136 (org.apache.hadoop.util.JvmPauseMonitor$Monitor@580c5f04):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 766
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.util.JvmPauseMonitor$Monitor.run(JvmPauseMonitor.java:192)
    java.lang.Thread.run(Thread.java:750)
Thread 88 (nioEventLoopGroup-2-1):
  State: RUNNABLE
  Blocked count: 1
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    io.netty.channel.nio.SelectedSelectionKeySetSelector.select(SelectedSelectionKeySetSelector.java:62)
    io.netty.channel.nio.NioEventLoop.select(NioEventLoop.java:754)
    io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:410)
    io.netty.util.concurrent.SingleThreadEventExecutor$2.run(SingleThreadEventExecutor.java:131)
    io.netty.util.concurrent.DefaultThreadFactory$DefaultRunnableDecorator.run(DefaultThreadFactory.java:138)
    java.lang.Thread.run(Thread.java:750)
Thread 87 (org.eclipse.jetty.server.session.HashSessionManager@1e1fdabaTimer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 14
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 86 (org.eclipse.jetty.server.session.HashSessionManager@3242f342Timer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 14
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 85 (org.eclipse.jetty.server.session.HashSessionManager@d6640a1Timer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 14
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 84 (qtp1673342250-84):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 7
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:392)
    org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:563)
    org.eclipse.jetty.util.thread.QueuedThreadPool.access$800(QueuedThreadPool.java:48)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:626)
    java.lang.Thread.run(Thread.java:750)
Thread 83 (qtp1673342250-83-acceptor-0@729a10f-ServerConnector@294c94ad{HTTP/1.1,[http/1.1]}{localhost:33959}):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:397)
    org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:601)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 82 (qtp1673342250-82):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:243)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:191)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceExecuteConsume(ExecuteProduceConsume.java:169)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceConsume(ExecuteProduceConsume.java:145)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.execute(ExecuteProduceConsume.java:100)
    org.eclipse.jetty.io.ManagedSelector.run(ManagedSelector.java:147)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 81 (pool-12-thread-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 73 (CacheReplicationMonitor(1579950160)):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 17
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2163)
    org.apache.hadoop.hdfs.server.blockmanagement.CacheReplicationMonitor.run(CacheReplicationMonitor.java:181)
Thread 72 (org.apache.hadoop.hdfs.server.namenode.FSNamesystem$LazyPersistFileScrubber@b436c14):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 3
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.namenode.FSNamesystem$LazyPersistFileScrubber.run(FSNamesystem.java:4107)
    java.lang.Thread.run(Thread.java:750)
Thread 71 (org.apache.hadoop.hdfs.server.namenode.FSNamesystem$NameNodeEditLogRoller@6139d548):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.namenode.FSNamesystem$NameNodeEditLogRoller.run(FSNamesystem.java:4016)
    java.lang.Thread.run(Thread.java:750)
Thread 70 (org.apache.hadoop.hdfs.server.namenode.FSNamesystem$NameNodeResourceMonitor@637ad349):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 86
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.namenode.FSNamesystem$NameNodeResourceMonitor.run(FSNamesystem.java:3974)
    java.lang.Thread.run(Thread.java:750)
Thread 69 (org.apache.hadoop.hdfs.server.namenode.LeaseManager$Monitor@6e5ec2aa):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 217
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.namenode.LeaseManager$Monitor.run(LeaseManager.java:534)
    java.lang.Thread.run(Thread.java:750)
Thread 67 (pool-7-thread-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 66 (IPC Server handler 4 on 43125):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 434
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 65 (IPC Server handler 3 on 43125):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 434
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 64 (IPC Server handler 2 on 43125):
  State: TIMED_WAITING
  Blocked count: 1
  Waited count: 436
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 63 (IPC Server handler 1 on 43125):
  State: TIMED_WAITING
  Blocked count: 1
  Waited count: 432
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 62 (IPC Server handler 0 on 43125):
  State: TIMED_WAITING
  Blocked count: 3
  Waited count: 421
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
    org.apache.hadoop.ipc.CallQueueManager.take(CallQueueManager.java:287)
    org.apache.hadoop.ipc.Server$Handler.run(Server.java:2664)
Thread 52 (IPC Server listener on 43125):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hadoop.ipc.Server$Listener.run(Server.java:1155)
Thread 55 (IPC Server Responder):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    org.apache.hadoop.ipc.Server$Responder.doRunLoop(Server.java:1330)
    org.apache.hadoop.ipc.Server$Responder.run(Server.java:1313)
Thread 48 (Block report processor):
  State: WAITING
  Blocked count: 0
  Waited count: 8
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@71d0c04d
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.ArrayBlockingQueue.take(ArrayBlockingQueue.java:403)
    org.apache.hadoop.hdfs.server.blockmanagement.BlockManager$BlockReportProcessingThread.processQueue(BlockManager.java:4913)
    org.apache.hadoop.hdfs.server.blockmanagement.BlockManager$BlockReportProcessingThread.run(BlockManager.java:4902)
Thread 47 (StorageInfoMonitor):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.blockmanagement.BlockManager$StorageInfoDefragmenter.run(BlockManager.java:4589)
    java.lang.Thread.run(Thread.java:750)
Thread 46 (RedundancyMonitor):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 147
  Stack:
    java.lang.Thread.sleep(Native Method)
    java.lang.Thread.sleep(Thread.java:342)
    java.util.concurrent.TimeUnit.sleep(TimeUnit.java:386)
    org.apache.hadoop.hdfs.server.blockmanagement.BlockManager$RedundancyMonitor.run(BlockManager.java:4554)
    java.lang.Thread.run(Thread.java:750)
Thread 49 (org.apache.hadoop.hdfs.server.blockmanagement.HeartbeatManager$Monitor@329a42e8):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 87
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.blockmanagement.HeartbeatManager$Monitor.run(HeartbeatManager.java:456)
    java.lang.Thread.run(Thread.java:750)
Thread 60 (DatanodeAdminMonitor-0):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 147
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 59 (org.apache.hadoop.hdfs.server.blockmanagement.PendingReconstructionBlocks$PendingReconstructionMonitor@479ce734):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 2
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.hdfs.server.blockmanagement.PendingReconstructionBlocks$PendingReconstructionMonitor.run(PendingReconstructionBlocks.java:246)
    java.lang.Thread.run(Thread.java:750)
Thread 54 (IPC Server idle connection scanner for port 43125):
  State: TIMED_WAITING
  Blocked count: 1
  Waited count: 44
  Stack:
    java.lang.Object.wait(Native Method)
    java.util.TimerThread.mainLoop(Timer.java:552)
    java.util.TimerThread.run(Timer.java:505)
Thread 53 (Socket Reader #1 for port 43125):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.hadoop.ipc.Server$Listener$Reader.doRunLoop(Server.java:1093)
    org.apache.hadoop.ipc.Server$Listener$Reader.run(Server.java:1072)
Thread 51 (FSEditLogAsync):
  State: WAITING
  Blocked count: 1
  Waited count: 37
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@3d1a4482
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.ArrayBlockingQueue.take(ArrayBlockingQueue.java:403)
    org.apache.hadoop.hdfs.server.namenode.FSEditLogAsync.dequeueEdit(FSEditLogAsync.java:221)
    org.apache.hadoop.hdfs.server.namenode.FSEditLogAsync.run(FSEditLogAsync.java:229)
    java.lang.Thread.run(Thread.java:750)
Thread 45 (org.eclipse.jetty.server.session.HashSessionManager@203fcd46Timer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 18
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 44 (org.eclipse.jetty.server.session.HashSessionManager@8b2a4a3Timer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 18
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 43 (org.eclipse.jetty.server.session.HashSessionManager@32e1f9e8Timer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 18
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 42 (qtp736183291-42):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 9
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:392)
    org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:563)
    org.eclipse.jetty.util.thread.QueuedThreadPool.access$800(QueuedThreadPool.java:48)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:626)
    java.lang.Thread.run(Thread.java:750)
Thread 41 (qtp736183291-41):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 9
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:392)
    org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:563)
    org.eclipse.jetty.util.thread.QueuedThreadPool.access$800(QueuedThreadPool.java:48)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:626)
    java.lang.Thread.run(Thread.java:750)
Thread 40 (qtp736183291-40):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 9
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    org.eclipse.jetty.util.BlockingArrayQueue.poll(BlockingArrayQueue.java:392)
    org.eclipse.jetty.util.thread.QueuedThreadPool.idleJobPoll(QueuedThreadPool.java:563)
    org.eclipse.jetty.util.thread.QueuedThreadPool.access$800(QueuedThreadPool.java:48)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:626)
    java.lang.Thread.run(Thread.java:750)
Thread 39 (qtp736183291-39-acceptor-0@7be82501-ServerConnector@3c16305f{HTTP/1.1,[http/1.1]}{localhost:36159}):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:421)
    sun.nio.ch.ServerSocketChannelImpl.accept(ServerSocketChannelImpl.java:249)
    org.eclipse.jetty.server.ServerConnector.accept(ServerConnector.java:397)
    org.eclipse.jetty.server.AbstractConnector$Acceptor.run(AbstractConnector.java:601)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 38 (qtp736183291-38):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:243)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:191)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.executeProduceConsume(ExecuteProduceConsume.java:249)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceConsume(ExecuteProduceConsume.java:148)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.execute(ExecuteProduceConsume.java:100)
    org.eclipse.jetty.io.ManagedSelector.run(ManagedSelector.java:147)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 37 (qtp736183291-37):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:243)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:191)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.executeProduceConsume(ExecuteProduceConsume.java:249)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceConsume(ExecuteProduceConsume.java:148)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.execute(ExecuteProduceConsume.java:100)
    org.eclipse.jetty.io.ManagedSelector.run(ManagedSelector.java:147)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 36 (qtp736183291-36):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:243)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:191)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.executeProduceConsume(ExecuteProduceConsume.java:249)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceConsume(ExecuteProduceConsume.java:148)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.execute(ExecuteProduceConsume.java:100)
    org.eclipse.jetty.io.ManagedSelector.run(ManagedSelector.java:147)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 35 (qtp736183291-35):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.select(ManagedSelector.java:243)
    org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:191)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.executeProduceConsume(ExecuteProduceConsume.java:249)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceConsume(ExecuteProduceConsume.java:148)
    org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.execute(ExecuteProduceConsume.java:100)
    org.eclipse.jetty.io.ManagedSelector.run(ManagedSelector.java:147)
    org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:671)
    org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:589)
    java.lang.Thread.run(Thread.java:750)
Thread 34 (pool-5-thread-1):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 33 (org.apache.hadoop.util.JvmPauseMonitor$Monitor@26c209f5):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 1092
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.hadoop.util.JvmPauseMonitor$Monitor.run(JvmPauseMonitor.java:192)
    java.lang.Thread.run(Thread.java:750)
Thread 32 (Timer for 'NameNode' metrics system):
  State: TIMED_WAITING
  Blocked count: 2
  Waited count: 52
  Stack:
    java.lang.Object.wait(Native Method)
    java.util.TimerThread.mainLoop(Timer.java:552)
    java.util.TimerThread.run(Timer.java:505)
Thread 23 (org.apache.hadoop.fs.FileSystem$Statistics$StatisticsDataReferenceCleaner):
  State: WAITING
  Blocked count: 1
  Waited count: 2
  Waiting on java.lang.ref.ReferenceQueue$Lock@3700fca2
  Stack:
    java.lang.Object.wait(Native Method)
    java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
    java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
    org.apache.hadoop.fs.FileSystem$Statistics$StatisticsDataReferenceCleaner.run(FileSystem.java:3755)
    java.lang.Thread.run(Thread.java:750)
Thread 22 (NIOWorkerThread-1):
  State: WAITING
  Blocked count: 0
  Waited count: 5
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@4569de61
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    java.lang.Thread.run(Thread.java:750)
Thread 21 (ProcessThread(sid:0 cport:63276):):
  State: WAITING
  Blocked count: 0
  Waited count: 51
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@457de822
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.zookeeper.server.PrepRequestProcessor.run(PrepRequestProcessor.java:134)
Thread 20 (SyncThread:0):
  State: WAITING
  Blocked count: 3
  Waited count: 51
  Waiting on java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject@6c9255cb
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
    java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
    org.apache.zookeeper.server.SyncRequestProcessor.run(SyncRequestProcessor.java:109)
Thread 19 (SessionTracker):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 339
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.zookeeper.server.SessionTrackerImpl.run(SessionTrackerImpl.java:151)
Thread 15 (ConnnectionExpirer):
  State: TIMED_WAITING
  Blocked count: 0
  Waited count: 68
  Stack:
    java.lang.Thread.sleep(Native Method)
    org.apache.zookeeper.server.NIOServerCnxnFactory$ConnectionExpirerThread.run(NIOServerCnxnFactory.java:574)
Thread 18 (NIOServerCxnFactory.AcceptThread:localhost/127.0.0.1:63276):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.zookeeper.server.NIOServerCnxnFactory$AcceptThread.select(NIOServerCnxnFactory.java:229)
    org.apache.zookeeper.server.NIOServerCnxnFactory$AcceptThread.run(NIOServerCnxnFactory.java:205)
Thread 16 (NIOServerCxnFactory.SelectorThread-0):
  State: RUNNABLE
  Blocked count: 1
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.zookeeper.server.NIOServerCnxnFactory$SelectorThread.select(NIOServerCnxnFactory.java:426)
    org.apache.zookeeper.server.NIOServerCnxnFactory$SelectorThread.run(NIOServerCnxnFactory.java:391)
Thread 17 (NIOServerCxnFactory.SelectorThread-1):
  State: RUNNABLE
  Blocked count: 1
  Waited count: 0
  Stack:
    sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
    sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
    sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
    sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
    sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
    org.apache.zookeeper.server.NIOServerCnxnFactory$SelectorThread.select(NIOServerCnxnFactory.java:426)
    org.apache.zookeeper.server.NIOServerCnxnFactory$SelectorThread.run(NIOServerCnxnFactory.java:391)
Thread 14 (Time-limited test):
  State: RUNNABLE
  Blocked count: 52
  Waited count: 379
  Stack:
    sun.management.ThreadImpl.getThreadInfo1(Native Method)
    sun.management.ThreadImpl.getThreadInfo(ThreadImpl.java:185)
    sun.management.ThreadImpl.getThreadInfo(ThreadImpl.java:144)
    org.apache.hadoop.hbase.util.ReflectionUtils.printThreadInfo(ReflectionUtils.java:159)
    org.apache.hadoop.hbase.util.Threads.printThreadInfo(Threads.java:198)
    org.apache.hadoop.hbase.util.JVMClusterUtil.waitForEvent(JVMClusterUtil.java:231)
    org.apache.hadoop.hbase.util.JVMClusterUtil.startup(JVMClusterUtil.java:188)
    org.apache.hadoop.hbase.LocalHBaseCluster.startup(LocalHBaseCluster.java:433)
    org.apache.hadoop.hbase.SingleProcessHBaseCluster.init(SingleProcessHBaseCluster.java:248)
    org.apache.hadoop.hbase.SingleProcessHBaseCluster.<init>(SingleProcessHBaseCluster.java:112)
    org.apache.hadoop.hbase.HBaseTestingUtil.startMiniHBaseCluster(HBaseTestingUtil.java:830)
    org.apache.hadoop.hbase.HBaseTestingUtil.startMiniCluster(HBaseTestingUtil.java:794)
    org.apache.hadoop.hbase.HBaseTestingUtil.startMiniCluster(HBaseTestingUtil.java:747)
    org.apache.hadoop.hbase.replication.TestReplicationBase.startClusters(TestReplicationBase.java:348)
    org.apache.hadoop.hbase.replication.TestReplicationBase.setUpBeforeClass(TestReplicationBase.java:365)
    sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    java.lang.reflect.Method.invoke(Method.java:498)
    org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
Thread 4 (Signal Dispatcher):
  State: RUNNABLE
  Blocked count: 0
  Waited count: 0
  Stack:
Thread 3 (Finalizer):
  State: WAITING
  Blocked count: 76
  Waited count: 76
  Waiting on java.lang.ref.ReferenceQueue$Lock@5c474117
  Stack:
    java.lang.Object.wait(Native Method)
    java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
    java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
    java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:188)
Thread 2 (Reference Handler):
  State: WAITING
  Blocked count: 74
  Waited count: 73
  Waiting on java.lang.ref.Reference$Lock@57561628
  Stack:
    java.lang.Object.wait(Native Method)
    java.lang.Object.wait(Object.java:502)
    java.lang.ref.Reference.tryHandlePending(Reference.java:191)
    java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)
Thread 1 (main):
  State: TIMED_WAITING
  Blocked count: 2
  Waited count: 2
  Stack:
    sun.misc.Unsafe.park(Native Method)
    java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
    java.util.concurrent.FutureTask.awaitDone(FutureTask.java:426)
    java.util.concurrent.FutureTask.get(FutureTask.java:204)
    org.junit.internal.runners.statements.FailOnTimeout.getResult(FailOnTimeout.java:156)
    org.junit.internal.runners.statements.FailOnTimeout.evaluate(FailOnTimeout.java:129)
    org.junit.rules.RunRules.evaluate(RunRules.java:20)
    org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
    org.junit.runners.ParentRunner.run(ParentRunner.java:413)
    org.junit.runners.Suite.runChild(Suite.java:128)
    org.junit.runners.Suite.runChild(Suite.java:27)
    org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
    org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
    org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
    org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
    org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
    org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
    org.junit.runners.ParentRunner.run(ParentRunner.java:413)
    org.junit.runner.JUnitCore.run(JUnitCore.java:137)
    org.junit.runner.JUnitCore.run(JUnitCore.java:115)
E
Time: 683,164
There was 1 failure:
1) org.apache.hadoop.hbase.replication.TestReplicationSmallTests
java.io.IOException: Shutting down
	at org.apache.hadoop.hbase.SingleProcessHBaseCluster.init(SingleProcessHBaseCluster.java:255)
	at org.apache.hadoop.hbase.SingleProcessHBaseCluster.<init>(SingleProcessHBaseCluster.java:112)
	at org.apache.hadoop.hbase.HBaseTestingUtil.startMiniHBaseCluster(HBaseTestingUtil.java:830)
	at org.apache.hadoop.hbase.HBaseTestingUtil.startMiniCluster(HBaseTestingUtil.java:794)
	at org.apache.hadoop.hbase.HBaseTestingUtil.startMiniCluster(HBaseTestingUtil.java:747)
	at org.apache.hadoop.hbase.replication.TestReplicationBase.startClusters(TestReplicationBase.java:348)
	at org.apache.hadoop.hbase.replication.TestReplicationBase.setUpBeforeClass(TestReplicationBase.java:365)
	... 13 trimmed
Caused by: java.lang.RuntimeException: Master not active after 30000ms
	at org.apache.hadoop.hbase.util.JVMClusterUtil.waitForEvent(JVMClusterUtil.java:232)
	at org.apache.hadoop.hbase.util.JVMClusterUtil.startup(JVMClusterUtil.java:188)
	at org.apache.hadoop.hbase.LocalHBaseCluster.startup(LocalHBaseCluster.java:433)
	at org.apache.hadoop.hbase.SingleProcessHBaseCluster.init(SingleProcessHBaseCluster.java:248)
	... 20 more

FAILURES!!!
Tests run: 0,  Failures: 1

