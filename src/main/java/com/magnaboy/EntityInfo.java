package com.magnaboy;

import java.util.UUID;
import net.runelite.api.coords.WorldPoint;

public class EntityInfo {
	public UUID uuid;
	public int regionId;
	public EntityType entityType;
	public WorldPoint worldLocation;
	public int[] modelIds = {};
	public Integer baseOrientation;
	public float[] scale;
	public float[] translate;
	public int[] modelRecolorFind = {};
	public int[] modelRecolorReplace = {};
	public AnimationID idleAnimation;
}
