/*
 * Copyright (C) 2016-2019 David Alejandro Rubio Escares / Kodehawa
 *
 * Mantaro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Mantaro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 *
 */

package net.kodehawa.mantarobot.core.modules.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.kodehawa.mantarobot.core.modules.commands.base.AbstractCommand;
import net.kodehawa.mantarobot.core.modules.commands.base.Category;
import net.kodehawa.mantarobot.core.modules.commands.base.CommandPermission;
import net.kodehawa.mantarobot.core.modules.commands.i18n.I18nContext;

public abstract class NoArgsCommand extends AbstractCommand {
    public NoArgsCommand(Category category) {
        super(category);
    }
    
    public NoArgsCommand(Category category, CommandPermission permission) {
        super(category, permission);
    }
    
    protected abstract void call(GuildMessageReceivedEvent event, I18nContext languageContext, String content);
    
    @Override
    public void run(GuildMessageReceivedEvent event, I18nContext languageContext, String commandName, String content) {
        call(event, languageContext, content);
    }
}
