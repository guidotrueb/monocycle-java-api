package io.monocycle.agent.api;

import java.util.Set;

/**
 * ServerSummary
 */
public class ServerSummary {

	private Integer coreCount;

	private Long totalMemory;

	private Long totalSwap;

	private String vendorName;

	private String vendorDescription;

	public Set<MountPointSummary> mountPoints;

	public Integer getCoreCount() {
		return coreCount;
	}

	public void setCoreCount(Integer coreCount) {
		this.coreCount = coreCount;
	}

	public Long getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(Long totalMemory) {
		this.totalMemory = totalMemory;
	}

	public Long getTotalSwap() {
		return totalSwap;
	}

	public void setTotalSwap(Long totalSwap) {
		this.totalSwap = totalSwap;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorDescription() {
		return vendorDescription;
	}

	public void setVendorDescription(String vendorDescription) {
		this.vendorDescription = vendorDescription;
	}

	public Set<MountPointSummary> getMountPoints() {
		return mountPoints;
	}

	public void setMountPoints(Set<MountPointSummary> mountPoints) {
		this.mountPoints = mountPoints;
	}

	public static class MountPointSummary {

		private String device;

		private String mountPoint;

		public MountPointSummary() {
			// Default Constructor
		}

		public MountPointSummary(String device, String mountPoint) {
			this.device = device;
			this.mountPoint = mountPoint;
		}

		public String getDevice() {
			return device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getMountPoint() {
			return mountPoint;
		}

		public void setMountPoint(String mountPoint) {
			this.mountPoint = mountPoint;
		}

	}

}
