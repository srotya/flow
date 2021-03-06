/**
 * Copyright 2016 Ambud Sharma
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.2
 */
package com.srotya.flow.collector.v5;

public class NetflowPacket {

	private NetflowHeader header;
	private NetflowRecord[] records;

	public NetflowPacket() {
	}

	public NetflowHeader getHeader() {
		return header;
	}

	public void setHeader(NetflowHeader header) {
		this.header = header;
	}

	public NetflowRecord[] getRecords() {
		return records;
	}

	public void setRecords(NetflowRecord[] records) {
		this.records = records;
	}

}