package com.dw.net;

import lombok.Data;

/**
 * 描述一个网络节点
 *
 * @author dw
 * @version 1.0.0
 * @since 2020/12/31 10:05
 */
@Data
public class NetNode {
  private final String ip;
  private final int port;

  private int workCounts;
  private int finishedCounts;

}
