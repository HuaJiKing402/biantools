package top.biannetwork.biantools.mixin;

import net.minecraft.server.command.GiveCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import net.minecraft.server.command.ServerCommandSource;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.injection.Redirect;
@Mixin(GiveCommand.class)
public abstract class GameModeCommandMixin
{
    @Dynamic

    @SuppressWarnings("DefaultAnnotationParam")
    @Redirect(
            method = "method_13404",  // lambda method
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/server/command/ServerCommandSource;hasPermissionLevel(I)Z",
                    remap = true
            ),
            allow = 1,
            remap = false
    )
    private static boolean checkIfAllowCheating(ServerCommandSource source, int level)
    {
        return true;
    }
}
