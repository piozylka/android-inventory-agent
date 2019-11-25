/**
 * ---------------------------------------------------------------------
 * GLPI Android Inventory Agent
 * Copyright (C) 2019 Teclib.
 *
 * https://glpi-project.org
 *
 * Based on Flyve MDM Inventory Agent For Android
 * Copyright © 2018 Teclib. All rights reserved.
 *
 * ---------------------------------------------------------------------
 *
 *  LICENSE
 *
 *  This file is part of GLPI Android Inventory Agent.
 *
 *  GLPI Android Inventory Agent is a subproject of GLPI.
 *
 *  GLPI Android Inventory Agent is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 3
 *  of the License, or (at your option) any later version.
 *
 *  GLPI Android Inventory Agent is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  ---------------------------------------------------------------------
 *  @copyright Copyright © 2019 Teclib. All rights reserved.
 *  @license   GPLv3 https://www.gnu.org/licenses/gpl-3.0.html
 *  @link      https://github.com/glpi-project/android-inventory-agent
 *  @link      https://glpi-project.org/glpi-network/
 *  ---------------------------------------------------------------------
 */

package org.glpi.inventory.agent.core.home;

public class HomeSchema {

    private String id;
    private String title;
    private String subTitle;
    private Boolean hasCheck;
    private Boolean checkValue;
    private Boolean isHeader;

    public HomeSchema(String id, String title) {
        this.id = id;
        this.title = title;
        this.hasCheck = false;
        this.isHeader = true;
    }

    public HomeSchema(String id, String title, String subTitle) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.hasCheck = false;
        this.isHeader = false;
    }

    public HomeSchema(String id, String title, String subTitle, Boolean checkValue) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.hasCheck = true;
        this.isHeader = false;
        this.checkValue = checkValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Boolean getHasCheck() {
        return hasCheck;
    }

    public void setHasCheck(Boolean hasCheck) {
        this.hasCheck = hasCheck;
    }

    public Boolean getCheckValue() {
        return checkValue;
    }

    public void setCheckValue(Boolean checkValue) {
        this.checkValue = checkValue;
    }

    public Boolean getHeader() {
        return isHeader;
    }

    public void setHeader(Boolean header) {
        isHeader = header;
    }
}
