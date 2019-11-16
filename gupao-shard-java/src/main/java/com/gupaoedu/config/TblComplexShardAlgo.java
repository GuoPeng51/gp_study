package com.gupaoedu.config;

import io.shardingjdbc.core.api.algorithm.sharding.ListShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.ShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;

import java.util.Collection;
import java.util.HashSet;

public class TblComplexShardAlgo implements ComplexKeysShardingAlgorithm {
    @Override
    public Collection<String> doSharding(Collection<String> tables , Collection<ShardingValue> shardingColumns) {
        Collection<String> routTables = new HashSet<String>();
        System.out.println("-------------------------------------------------->"+tables.toString());
        System.out.println("-------------------------------------------------->"+shardingColumns.toString());
        for (String table: tables ) {

            for (ShardingValue ShardingColumn: shardingColumns) {
                //String logicTableName = ShardingColumn.getLogicTableName();
                Collection values = ((ListShardingValue) ShardingColumn).getValues();
                for (Object value: values) {
                    if (table.contains((String)value)){
                        routTables.add(table);
                    }
                }
            }
        }

        return routTables;
    }

}
