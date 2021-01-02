package com.dw.resource;

import lombok.Data;

/**
 * TODO
 *
 * @author dw
 * @version 1.0.0
 * @since 2021/01/02 18:13
 */
@Data
public class ResourceInfo {
  private final int resourceId;
  private final String resourceName;
  private final long length;
  private final String owner;

}
