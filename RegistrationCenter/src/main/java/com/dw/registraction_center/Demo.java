package com.dw.registraction_center;


import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.kv.GetResponse;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * TODO
 *
 * @author dw
 * @version 1.0.0
 * @since 2020/12/30 19:30
 */
public class Demo {
  public static void main(String[] args) {
    Client client = Client.builder().endpoints("http://101.37.160.185:2379").build();
    KV kvClient = client.getKVClient();
    ByteSequence key = ByteSequence.from("aa".getBytes(StandardCharsets.UTF_8));
    ByteSequence value = ByteSequence.from("bb".getBytes(StandardCharsets.UTF_8));
    try {
      kvClient.put(key, value).get();
      CompletableFuture<GetResponse> future = kvClient.get(key);
      GetResponse getResponse = future.get();
      System.out.println(getResponse.getCount());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }
}
