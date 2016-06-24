package applqpak.Broadcast;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.Command;
import cn.nukkit.Player;

public class Main extends PluginBase
{

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

          String message = args[0];

          this.getServer().broadcastMessage(message);

        }

      break;

    }

    return true;

  }

}
