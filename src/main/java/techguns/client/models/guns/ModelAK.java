package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelAK extends ModelMultipart {
	// fields
	ModelRenderer Magazine05;
	ModelRenderer Grip2;
	ModelRenderer MagHolder;
	ModelRenderer Trigger02;
	ModelRenderer Barrel;
	ModelRenderer Receiver06;
	ModelRenderer Trigger01;
	ModelRenderer Magazine01;
	ModelRenderer Magazine02;
	ModelRenderer Grip1;
	ModelRenderer Magazine06;
	ModelRenderer Magazine03;
	ModelRenderer Magazine04;
	ModelRenderer Receiver03;
	ModelRenderer Handguard01;
	ModelRenderer Handguard02;
	ModelRenderer Barrel03;
	ModelRenderer Barrel02;
	ModelRenderer Receiver02;
	ModelRenderer Stock09;
	ModelRenderer Barrel04;
	ModelRenderer BarrelIS;
	ModelRenderer BarrelMain;
	ModelRenderer BarrelFront;
	ModelRenderer BarrelMid;
	ModelRenderer ISTop;
	ModelRenderer ISFront;
	ModelRenderer Receiver05;
	ModelRenderer Receiver04;
	ModelRenderer Stock04;
	ModelRenderer Stock03;
	ModelRenderer Stock05;
	ModelRenderer Stock06;
	ModelRenderer Stock07;
	ModelRenderer Stock08;

	public ModelAK() {
		textureWidth = 128;
		textureHeight = 64;

		Magazine05 = new ModelRenderer(this, 0, 0);
		Magazine05.addBox(0F, 0F, 0F, 2, 8, 2);
		Magazine05.setRotationPoint(-1.5F, 0F, -8F);
		Magazine05.setTextureSize(128, 64);
		Magazine05.mirror = true;
		setRotation(Magazine05, -0.1570796F, 0F, 0F);
		Grip2 = new ModelRenderer(this, 0, 11);
		Grip2.addBox(0F, 0F, 0F, 3, 2, 1);
		Grip2.setRotationPoint(-2F, 1F, 11F);
		Grip2.setTextureSize(128, 64);
		Grip2.mirror = true;
		setRotation(Grip2, 0F, 0F, 0F);
		MagHolder = new ModelRenderer(this, 18, 14);
		MagHolder.addBox(0F, 0F, 0F, 3, 3, 2);
		MagHolder.setRotationPoint(-2F, 1F, -1F);
		MagHolder.setTextureSize(128, 64);
		MagHolder.mirror = true;
		setRotation(MagHolder, 0F, 0F, 0F);
		Trigger02 = new ModelRenderer(this, 13, 15);
		Trigger02.addBox(0F, 0F, 0F, 1, 3, 1);
		Trigger02.setRotationPoint(-1F, 0.5F, 5F);
		Trigger02.setTextureSize(128, 64);
		Trigger02.mirror = true;
		setRotation(Trigger02, -0.2617994F, 0F, 0F);
		Barrel = new ModelRenderer(this, 37, 27);
		Barrel.addBox(0F, 0F, 0F, 3, 3, 3);
		Barrel.setRotationPoint(-0.5F, -4.5F, -31F);
		Barrel.setTextureSize(128, 64);
		Barrel.mirror = true;
		setRotation(Barrel, 0F, 0F, 0.7853982F);
		Receiver06 = new ModelRenderer(this, 48, 0);
		Receiver06.addBox(0F, 0F, 0F, 1, 1, 1);
		Receiver06.setRotationPoint(-1F, -6F, 12.5F);
		Receiver06.setTextureSize(128, 64);
		Receiver06.mirror = true;
		setRotation(Receiver06, -1.22173F, 0F, 0F);
		Trigger01 = new ModelRenderer(this, 22, 13);
		Trigger01.addBox(0F, 0F, 0F, 2, 1, 7);
		Trigger01.setRotationPoint(-1.5F, 4F, 2F);
		Trigger01.setTextureSize(128, 64);
		Trigger01.mirror = true;
		setRotation(Trigger01, 0F, 0F, 0F);
		Magazine01 = new ModelRenderer(this, 34, 13);
		Magazine01.addBox(0F, 0F, 0F, 2, 4, 1);
		Magazine01.setRotationPoint(-1.5F, 1F, 1F);
		Magazine01.setTextureSize(128, 64);
		Magazine01.mirror = true;
		setRotation(Magazine01, 0F, 0F, 0F);
		Magazine02 = new ModelRenderer(this, 0, 15);
		Magazine02.addBox(0F, 0F, 0F, 3, 3, 5);
		Magazine02.setRotationPoint(-2F, 1F, 6F);
		Magazine02.setTextureSize(128, 64);
		Magazine02.mirror = true;
		setRotation(Magazine02, 0F, 0F, 0F);
		Grip1 = new ModelRenderer(this, 26, 0);
		Grip1.addBox(0F, 0F, 0F, 3, 8, 4);
		Grip1.setRotationPoint(-2F, 4F, 7F);
		Grip1.setTextureSize(128, 64);
		Grip1.mirror = true;
		setRotation(Grip1, 0.3717861F, 0F, 0F);
		Magazine06 = new ModelRenderer(this, 0, 0);
		Magazine06.addBox(0F, 0F, 0F, 2, 8, 2);
		Magazine06.setRotationPoint(-1.5F, 7.4F, -9F);
		Magazine06.setTextureSize(128, 64);
		Magazine06.mirror = true;
		setRotation(Magazine06, -0.3490659F, 0F, 0F);
		Magazine03 = new ModelRenderer(this, 9, 0);
		Magazine03.addBox(0F, 0F, 0F, 3, 8, 5);
		Magazine03.setRotationPoint(-2F, 0F, -6F);
		Magazine03.setTextureSize(128, 64);
		Magazine03.mirror = true;
		setRotation(Magazine03, -0.1570796F, 0F, 0F);
		Magazine04 = new ModelRenderer(this, 9, 0);
		Magazine04.addBox(0F, 0F, 0F, 3, 9, 5);
		Magazine04.setRotationPoint(-2F, 7F, -7F);
		Magazine04.setTextureSize(128, 64);
		Magazine04.mirror = true;
		setRotation(Magazine04, -0.3490659F, 0F, 0F);
		Receiver03 = new ModelRenderer(this, 48, 0);
		Receiver03.addBox(0F, 0F, 0F, 4, 3, 7);
		Receiver03.setRotationPoint(-2.5F, -7F, -19F);
		Receiver03.setTextureSize(128, 64);
		Receiver03.mirror = true;
		setRotation(Receiver03, 0F, 0F, 0F);
		Handguard01 = new ModelRenderer(this, 48, 10);
		Handguard01.addBox(0F, 0F, 0F, 3, 3, 9);
		Handguard01.setRotationPoint(-2F, -7F, -28F);
		Handguard01.setTextureSize(128, 64);
		Handguard01.mirror = true;
		setRotation(Handguard01, 0F, 0F, 0F);
		Handguard02 = new ModelRenderer(this, 92, 0);
		Handguard02.addBox(0F, 0F, 0F, 4, 5, 14);
		Handguard02.setRotationPoint(-2.5F, -4F, -28F);
		Handguard02.setTextureSize(128, 64);
		Handguard02.mirror = true;
		setRotation(Handguard02, 0F, 0F, 0F);
		Barrel03 = new ModelRenderer(this, 0, 46);
		Barrel03.addBox(0F, 0F, 0F, 1, 6, 1);
		Barrel03.setRotationPoint(-1F, -8.033334F, -50F);
		Barrel03.setTextureSize(128, 64);
		Barrel03.mirror = true;
		setRotation(Barrel03, 0.3717861F, 0F, 0F);
		Barrel02 = new ModelRenderer(this, 37, 34);
		Barrel02.addBox(0F, 0F, 0F, 2, 2, 9);
		Barrel02.setRotationPoint(-0.5F, -7.033333F, -37F);
		Barrel02.setTextureSize(128, 64);
		Barrel02.mirror = true;
		setRotation(Barrel02, 0F, 0F, 0.7853982F);
		Receiver02 = new ModelRenderer(this, 0, 31);
		Receiver02.addBox(0F, 0F, 0F, 4, 5, 28);
		Receiver02.setRotationPoint(-2.5F, -4F, -14F);
		Receiver02.setTextureSize(128, 64);
		Receiver02.mirror = true;
		setRotation(Receiver02, 0F, 0F, 0F);
		Stock09 = new ModelRenderer(this, 76, 35);
		Stock09.addBox(0F, 0F, 0F, 4, 1, 2);
		Stock09.setRotationPoint(-2.5F, -4F, 14F);
		Stock09.setTextureSize(128, 64);
		Stock09.mirror = true;
		setRotation(Stock09, 0F, 0F, 0F);
		Barrel04 = new ModelRenderer(this, 13, 40);
		Barrel04.addBox(0F, 0F, 0F, 2, 2, 5);
		Barrel04.setRotationPoint(-1.5F, -3.033333F, -40F);
		Barrel04.setTextureSize(128, 64);
		Barrel04.mirror = true;
		setRotation(Barrel04, 0.9599311F, 0F, 0F);
		BarrelIS = new ModelRenderer(this, 0, 33);
		BarrelIS.addBox(0F, 0F, 0F, 1, 1, 2);
		BarrelIS.setRotationPoint(-1F, -9.033334F, -51F);
		BarrelIS.setTextureSize(128, 64);
		BarrelIS.mirror = true;
		setRotation(BarrelIS, 0F, 0F, 0F);
		BarrelMain = new ModelRenderer(this, 70, 35);
		BarrelMain.addBox(0F, 0F, 0F, 2, 2, 27);
		BarrelMain.setRotationPoint(-0.5F, -3.5F, -58F);
		BarrelMain.setTextureSize(128, 64);
		BarrelMain.mirror = true;
		setRotation(BarrelMain, 0F, 0F, 0.7853982F);
		BarrelFront = new ModelRenderer(this, 0, 48);
		BarrelFront.addBox(0F, 0F, 0F, 3, 3, 6);
		BarrelFront.setRotationPoint(-0.5F, -4.5F, -52F);
		BarrelFront.setTextureSize(128, 64);
		BarrelFront.mirror = true;
		setRotation(BarrelFront, 0F, 0F, 0.7853982F);
		BarrelMid = new ModelRenderer(this, 0, 39);
		BarrelMid.addBox(0F, 0F, 0F, 3, 3, 3);
		BarrelMid.setRotationPoint(-0.5F, -4.5F, -40F);
		BarrelMid.setTextureSize(128, 64);
		BarrelMid.mirror = true;
		setRotation(BarrelMid, 0F, 0F, 0.7853982F);
		ISTop = new ModelRenderer(this, 0, 24);
		ISTop.addBox(0F, 0F, 0F, 1, 1, 7);
		ISTop.setRotationPoint(-1F, -7.033333F, -18F);
		ISTop.setTextureSize(128, 64);
		ISTop.mirror = true;
		setRotation(ISTop, 0.1396263F, 0F, 0F);
		ISFront = new ModelRenderer(this, 0, 46);
		ISFront.addBox(0F, 0F, 0F, 1, 6, 1);
		ISFront.setRotationPoint(-1F, -8.033334F, -51F);
		ISFront.setTextureSize(128, 64);
		ISFront.mirror = true;
		setRotation(ISFront, 0F, 0F, 0F);
		Receiver05 = new ModelRenderer(this, 18, 0);
		Receiver05.addBox(0F, 0F, 0F, 3, 3, 23);
		Receiver05.setRotationPoint(-2F, -7F, -12F);
		Receiver05.setTextureSize(128, 64);
		Receiver05.mirror = true;
		setRotation(Receiver05, 0F, 0F, 0F);
		Receiver04 = new ModelRenderer(this, 13, 32);
		Receiver04.addBox(0F, 0F, 0F, 3, 3, 4);
		Receiver04.setRotationPoint(-2F, -7F, 11F);
		Receiver04.setTextureSize(128, 64);
		Receiver04.mirror = true;
		setRotation(Receiver04, -0.8726646F, 0F, 0F);
		Stock04 = new ModelRenderer(this, 46, 36);
		Stock04.addBox(0F, 0F, 0F, 4, 1, 21);
		Stock04.setRotationPoint(-2.5F, 1F, 19F);
		Stock04.setTextureSize(128, 64);
		Stock04.mirror = true;
		setRotation(Stock04, 0F, 0F, 0F);
		Stock03 = new ModelRenderer(this, 58, 1);
		Stock03.addBox(0F, 0F, 0F, 4, 4, 26);
		Stock03.setRotationPoint(-2.5F, -3F, 14F);
		Stock03.setTextureSize(128, 64);
		Stock03.mirror = true;
		setRotation(Stock03, 0F, 0F, 0F);
		Stock05 = new ModelRenderer(this, 60, 41);
		Stock05.addBox(0F, 0F, 0F, 4, 1, 7);
		Stock05.setRotationPoint(-2.5F, 4F, 33F);
		Stock05.setTextureSize(128, 64);
		Stock05.mirror = true;
		setRotation(Stock05, 0F, 0F, 0F);
		Stock06 = new ModelRenderer(this, 55, 34);
		Stock06.addBox(0F, 0F, 0F, 4, 1, 12);
		Stock06.setRotationPoint(-2.5F, -4F, 28F);
		Stock06.setTextureSize(128, 64);
		Stock06.mirror = true;
		setRotation(Stock06, 0F, 0F, 0F);
		Stock07 = new ModelRenderer(this, 57, 40);
		Stock07.addBox(0F, 0F, 0F, 4, 1, 10);
		Stock07.setRotationPoint(-2.5F, 3F, 30F);
		Stock07.setTextureSize(128, 64);
		Stock07.mirror = true;
		setRotation(Stock07, 0F, 0F, 0F);
		Stock08 = new ModelRenderer(this, 52, 37);
		Stock08.addBox(0F, 0F, 0F, 4, 1, 15);
		Stock08.setRotationPoint(-2.5F, 2F, 25F);
		Stock08.setTextureSize(128, 64);
		Stock08.mirror = true;
		setRotation(Stock08, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, int ammoLeft, float reloadProgress,
			TransformType transformType, int part, float fireProgress, float chargeProgress) {
		Magazine05.render(scale);
		Grip2.render(scale);
		MagHolder.render(scale);
		Trigger02.render(scale);
		Barrel.render(scale);
		Receiver06.render(scale);
		Trigger01.render(scale);
		Magazine01.render(scale);
		Magazine02.render(scale);
		Grip1.render(scale);
		Magazine06.render(scale);
		Magazine03.render(scale);
		Magazine04.render(scale);
		Receiver03.render(scale);
		Handguard01.render(scale);
		Handguard02.render(scale);
		Barrel03.render(scale);
		Barrel02.render(scale);
		Receiver02.render(scale);
		Stock09.render(scale);
		Barrel04.render(scale);
		BarrelIS.render(scale);
		BarrelMain.render(scale);
		BarrelFront.render(scale);
		BarrelMid.render(scale);
		ISTop.render(scale);
		ISFront.render(scale);
		Receiver05.render(scale);
		Receiver04.render(scale);
		Stock04.render(scale);
		Stock03.render(scale);
		Stock05.render(scale);
		Stock06.render(scale);
		Stock07.render(scale);
		Stock08.render(scale);

	}
}