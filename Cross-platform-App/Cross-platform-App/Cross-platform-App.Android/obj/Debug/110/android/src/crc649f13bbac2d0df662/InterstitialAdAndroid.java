package crc649f13bbac2d0df662;


public class InterstitialAdAndroid
	extends com.google.android.gms.ads.AdListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClosed:()V:GetOnAdClosedHandler\n" +
			"n_onAdLoaded:()V:GetOnAdLoadedHandler\n" +
			"";
		mono.android.Runtime.register ("Cross_platform_App.Droid.InterstitialAdAndroid, YourPublicInfo", InterstitialAdAndroid.class, __md_methods);
	}


	public InterstitialAdAndroid ()
	{
		super ();
		if (getClass () == InterstitialAdAndroid.class)
			mono.android.TypeManager.Activate ("Cross_platform_App.Droid.InterstitialAdAndroid, YourPublicInfo", "", this, new java.lang.Object[] {  });
	}


	public void onAdClosed ()
	{
		n_onAdClosed ();
	}

	private native void n_onAdClosed ();


	public void onAdLoaded ()
	{
		n_onAdLoaded ();
	}

	private native void n_onAdLoaded ();

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
