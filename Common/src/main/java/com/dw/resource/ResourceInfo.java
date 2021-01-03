package com.dw.resource;

import lombok.Data;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "ResourceInfo{" +
        "resourceId=" + resourceId +
        ", resourceName='" + resourceName + '\'' +
        ", length=" + length +
        ", owner='" + owner + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceInfo that = (ResourceInfo) o;
    return resourceId == that.resourceId && length == that.length && resourceName.equals(that.resourceName)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceName, length, owner);
  }
}
