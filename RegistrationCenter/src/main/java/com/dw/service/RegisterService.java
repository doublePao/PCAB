package com.dw.service;

import com.dw.net.NetNode;

import java.util.List;

/**
 * 注册中心对外提供的服务。
 *
 * @author dw
 * @version 1.0.0
 * @since 2020/12/31 10:32
 */
public interface RegisterService {

  public List<NetNode> listAllNodes();

  public List<String> listAllResources();

  public List<NetNode> getNodesByResourceInfo(String resourceInfo);

}
