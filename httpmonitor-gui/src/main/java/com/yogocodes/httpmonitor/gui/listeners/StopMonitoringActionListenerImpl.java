package com.yogocodes.httpmonitor.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.yogocodes.httpmonitor.gui.form.HttpMonitorAppForm;
import com.yogocodes.httpmonitor.gui.form.HttpMonitorAppFormFactory;

public class StopMonitoringActionListenerImpl implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		HttpMonitorAppForm appForm = HttpMonitorAppFormFactory.getAppFormInstance();
		appForm.getResultTableRefreshTimer().stop();
	}

}
