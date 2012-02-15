package com.yogocodes.httpmonitor.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.yogocodes.httpmonitor.core.HttpMonitorEngine;
import com.yogocodes.httpmonitor.core.HttpMonitorEngineFactory;
import com.yogocodes.httpmonitor.gui.form.HttpMonitorAppForm;
import com.yogocodes.httpmonitor.gui.form.HttpMonitorAppFormFactory;

public class StopMonitoringActionListenerImpl implements ActionListener {

	@Override
	public void actionPerformed(final ActionEvent e) {
		final HttpMonitorAppForm appForm = HttpMonitorAppFormFactory.getAppFormInstance();
		final HttpMonitorEngine engineInstance = HttpMonitorEngineFactory.getEngineInstance();
		appForm.getResultTableRefreshTimer().stop();

		engineInstance.stop();
	}

	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this);
		return builder.toString();
	}
}
