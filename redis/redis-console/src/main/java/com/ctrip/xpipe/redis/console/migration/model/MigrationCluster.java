package com.ctrip.xpipe.redis.console.migration.model;

import com.ctrip.xpipe.api.observer.Observer;

/**
 * @author shyin
 *
 * Dec 8, 2016
 */
public interface MigrationCluster extends Observer, MigrationClusterInfoHolder, MigrationClusterAction, MigrationClusterServiceHolder {

}
