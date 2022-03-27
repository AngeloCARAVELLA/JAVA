package it.studenti.unisannio.caravella.angelo.utils;

import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.Map;

import javax.management.ObjectName;

public class TableNotFoundException extends RuntimeException implements RuntimeMXBean {

	public TableNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public TableNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TableNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public TableNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TableNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ObjectName getObjectName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManagementSpecVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClassPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLibraryPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBootClassPathSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBootClassPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getInputArguments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getUptime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getStartTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, String> getSystemProperties() {
		// TODO Auto-generated method stub
		return null;
	}

}
