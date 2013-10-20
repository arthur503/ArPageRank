ArPageRank
==========

这是[arthur503](http://arthur503.github.io/blog)写的PageRank算法的Java实现。

根据随机访问者模型，以15%的概率跳出，其余情况下在当前访问页面随即选择一个链接进行visit()。

数据类包括：Internet（保存所有WebPage节点）、WebPage（保存本节点的链接link和visitCount）、Person（访问WebPage链接，需初始化起始WebPage）。


参考资料：

* 《改变未来的九大算法》