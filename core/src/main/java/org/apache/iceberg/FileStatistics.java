/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iceberg;
public class FileStatistics {

    private long recordCount;

    private java.util.Map<java.lang.Integer,java.lang.Long> valueCounts;

    private java.util.Map<java.lang.Integer,java.lang.Long> nullValueCounts;

    private java.util.Map<java.lang.Integer,java.lang.Long> nanValueCounts;

    private java.util.Map<java.lang.Integer,java.nio.ByteBuffer> lowerBounds;

    private java.util.Map<java.lang.Integer,java.nio.ByteBuffer> upperBounds;

    public long getRecordCount() {
        return recordCount;
    }

    public java.util.Map getValueCounts() {
        return valueCounts;
    }

    public java.util.Map getNullValueCounts() {
        return nullValueCounts;
    }

    public java.util.Map getNanValueCounts() {
        return nanValueCounts;
    }

    public java.util.Map getLowerBounds() {
        return lowerBounds;
    }

    public java.util.Map getUpperBounds() {
        return upperBounds;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount=recordCount;
    }

    public void setValueCounts(java.util.Map valueCounts) {
        this.valueCounts=valueCounts;
    }

    public void setNullValueCounts(java.util.Map nullValueCounts) {
        this.nullValueCounts=nullValueCounts;
    }

    public void setNanValueCounts(java.util.Map nanValueCounts) {
        this.nanValueCounts=nanValueCounts;
    }

    public void setLowerBounds(java.util.Map lowerBounds) {
        this.lowerBounds=lowerBounds;
    }

    public void setUpperBounds(java.util.Map upperBounds) {
        this.upperBounds=upperBounds;
    }

    public FileStatistics    (long recordCount,java.util.Map valueCounts,java.util.Map nullValueCounts,java.util.Map nanValueCounts,java.util.Map lowerBounds,java.util.Map upperBounds){
        this.recordCount    =    recordCount;
        this.valueCounts    =    valueCounts;
        this.nullValueCounts    =    nullValueCounts;
        this.nanValueCounts    =    nanValueCounts;
        this.lowerBounds    =    lowerBounds;
        this.upperBounds    =    upperBounds;
}
}
