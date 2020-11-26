package crc649f13bbac2d0df662;


public class AdBannerRenderer
	extends crc643f46942d9dd1fff9.ViewRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cross_platform_App.Droid.AdBannerRenderer, YourPublicInfo", AdBannerRenderer.class, __md_methods);
	}


	public AdBannerRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AdBannerRenderer.class)
			mono.android.TypeManager.Activate ("Cross_platform_App.Droid.AdBannerRenderer, YourPublicInfo", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public AdBannerRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AdBannerRenderer.class)
			mono.android.TypeManager.Activate ("Cross_platform_App.Droid.AdBannerRenderer, YourPublicInfo", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AdBannerRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AdBannerRenderer.class)
			mono.android.TypeManager.Activate ("Cross_platform_App.Droid.AdBannerRenderer, YourPublicInfo", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
