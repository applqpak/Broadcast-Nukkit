package applqpak.Broadcast;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.Command;
import cn.nukkit.Player;

import java.lang.*;

public class Main extends PluginBase
{

  public String implode(String glue, String[] strArray)
  {

    String ret = "";

    for(int i = 0; i < strArray.length; i++)
    {

      if(strArray[i].trim() != "")
      {

        ret += (i = strArray.length - 1) ? strArray[i] : strArray[i] + glue;

      }

    }

    return ret;

  }

  @Override

  public void onEnable()
  {

    this.getLogger().info(TextFormat.WHITE + "Enabled.");

  }

  @Override

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {

    switch(cmd.getName())
    {

      case "broadcast":

        if(args[0] == null)
        {

          sender.sendMessage(TextFormat.RED + "Invalid usage. Usage: /broadcast < message >");

        }
        else
        {

          String message = this.implode(" ", args);

          this.getServer().broadcastMessage(message);

        }

      break;

    }

    return true;

  }

}
