/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon EBS volume.
 * </p>
 */
public class Ebs implements Serializable {

    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String snapshotId;

    /**
     * The volume size, in GiB. For <code>standard</code> volumes, specify a
     * value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     * from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     * to 16,384. If you specify a snapshot, the volume size must be equal to
     * or larger than the snapshot size. <p>Default: If you create a volume
     * from a snapshot and you don't specify a volume size, the default is
     * the snapshot size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     */
    private Integer volumeSize;

    /**
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     * <code>gp2</code> <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String volumeType;

    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>Default: <code>true</code>
     */
    private Boolean deleteOnTermination;

    /**
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. <p>Constraint: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     */
    private Integer iops;

    /**
     * Indicates whether the volume should be encrypted. Encrypted EBS
     * volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private Boolean encrypted;

    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param snapshotId The ID of the snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param snapshotId The ID of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The volume size, in GiB. For <code>standard</code> volumes, specify a
     * value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     * from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     * to 16,384. If you specify a snapshot, the volume size must be equal to
     * or larger than the snapshot size. <p>Default: If you create a volume
     * from a snapshot and you don't specify a volume size, the default is
     * the snapshot size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @return The volume size, in GiB. For <code>standard</code> volumes, specify a
     *         value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     *         from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     *         to 16,384. If you specify a snapshot, the volume size must be equal to
     *         or larger than the snapshot size. <p>Default: If you create a volume
     *         from a snapshot and you don't specify a volume size, the default is
     *         the snapshot size.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The volume size, in GiB. For <code>standard</code> volumes, specify a
     * value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     * from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     * to 16,384. If you specify a snapshot, the volume size must be equal to
     * or larger than the snapshot size. <p>Default: If you create a volume
     * from a snapshot and you don't specify a volume size, the default is
     * the snapshot size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize The volume size, in GiB. For <code>standard</code> volumes, specify a
     *         value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     *         from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     *         to 16,384. If you specify a snapshot, the volume size must be equal to
     *         or larger than the snapshot size. <p>Default: If you create a volume
     *         from a snapshot and you don't specify a volume size, the default is
     *         the snapshot size.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The volume size, in GiB. For <code>standard</code> volumes, specify a
     * value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     * from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     * to 16,384. If you specify a snapshot, the volume size must be equal to
     * or larger than the snapshot size. <p>Default: If you create a volume
     * from a snapshot and you don't specify a volume size, the default is
     * the snapshot size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize The volume size, in GiB. For <code>standard</code> volumes, specify a
     *         value from 1 to 1,024. For <code>io1</code> volumes, specify a value
     *         from 4 to 16,384. For <code>gp2</code> volumes, specify a value from 1
     *         to 16,384. If you specify a snapshot, the volume size must be equal to
     *         or larger than the snapshot size. <p>Default: If you create a volume
     *         from a snapshot and you don't specify a volume size, the default is
     *         the snapshot size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     * <code>gp2</code> <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The volume type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *         EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     *         <code>gp2</code> <p>Default: <code>standard</code>
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     * <code>gp2</code> <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType The volume type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *         EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     *         <code>gp2</code> <p>Default: <code>standard</code>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     * <code>gp2</code> <p>Default: <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType The volume type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *         EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>Valid values: <code>standard</code> | <code>io1</code> |
     *         <code>gp2</code> <p>Default: <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>Default: <code>true</code>
     *
     * @return Indicates whether the volume is deleted on instance termination.
     *         <p>Default: <code>true</code>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>Default: <code>true</code>
     *
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     *         <p>Default: <code>true</code>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
     *         <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether the volume is deleted on instance termination.
     * <p>Default: <code>true</code>
     *
     * @return Indicates whether the volume is deleted on instance termination.
     *         <p>Default: <code>true</code>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. <p>Constraint: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @return The number of I/O operations per second (IOPS) to provision for the
     *         volume. <p>Constraint: Required when the volume type is
     *         <code>io1</code>.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. <p>Constraint: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops The number of I/O operations per second (IOPS) to provision for the
     *         volume. <p>Constraint: Required when the volume type is
     *         <code>io1</code>.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) to provision for the
     * volume. <p>Constraint: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops The number of I/O operations per second (IOPS) to provision for the
     *         volume. <p>Constraint: Required when the volume type is
     *         <code>io1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Indicates whether the volume should be encrypted. Encrypted EBS
     * volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Indicates whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or an unencrypted volume from an
     *         encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * Indicates whether the volume should be encrypted. Encrypted EBS
     * volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param encrypted Indicates whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or an unencrypted volume from an
     *         encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * Indicates whether the volume should be encrypted. Encrypted EBS
     * volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted Indicates whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or an unencrypted volume from an
     *         encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Indicates whether the volume should be encrypted. Encrypted EBS
     * volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are
     * automatically encrypted. There is no way to create an encrypted volume
     * from an unencrypted snapshot or an unencrypted volume from an
     * encrypted snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Indicates whether the volume should be encrypted. Encrypted EBS
     *         volumes must be attached to instances that support Amazon EBS
     *         encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume
     *         from an unencrypted snapshot or an unencrypted volume from an
     *         encrypted snapshot. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null) sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Ebs == false) return false;
        Ebs other = (Ebs)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null) return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        return true;
    }
    
}
    