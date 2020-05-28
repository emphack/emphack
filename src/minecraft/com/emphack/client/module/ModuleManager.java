package com.emphack.client.module;

import java.util.ArrayList;

import com.emphack.client.modules.Sprint;

public class ModuleManager {
	
	public ArrayList<Module> moduleList = new ArrayList<Module>();
	
	public void init() {
		moduleList.add(new Sprint());
	}
	
	public ArrayList<Module> getEnabledModules() {
		ArrayList<Module> toggledModules = new ArrayList<Module>();
		for(Module module : moduleList) {
			if(module.isEnabled()) {
				toggledModules.add(module);
			}
		}
		return toggledModules;
	}
	
}
