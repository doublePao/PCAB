package com.dw.registraction_center;

import com.dw.net.NetNode;
import com.dw.resource.ResourceInfo;
import com.dw.service.RegisterService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author dw
 * @version 1.0.0
 * @since 2021/01/02 21:24
 */
public class RegisterServiceMapImpl implements RegisterService {
  private static final Map<ResourceInfo, List<NetNode>> RESOURCE_INFO_MAP = new ConcurrentHashMap<>();

  @Override
  public List<NetNode> listAllNodes() {
    return null;
  }

  @Override
  public List<ResourceInfo> listAllResources() {
    return null;
  }

  @Override
  public List<NetNode> getNodesByResourceInfo(ResourceInfo resourceInfo) {
    return null;
  }
}
