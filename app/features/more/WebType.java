package com.forsale.app.features.more;

import com.forsale.app.utils.prefUtils.preferences.SocialMediaPrefs;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import falcon.chat.entities.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebType.kt */
/* loaded from: classes2.dex */
public final class WebType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ WebType[] $VALUES;
    public static final a Companion;
    private static final Map<String, WebType> map;
    private final String value;
    public static final WebType PRIVACY_POLICY = new WebType("PRIVACY_POLICY", 0, "getPrivacyPolicy");
    public static final WebType TERMS_CONDITIONS = new WebType("TERMS_CONDITIONS", 1, "getTermsAndConditions");
    public static final WebType ABOUT = new WebType("ABOUT", 2, "getAboutUs");
    public static final WebType HELP = new WebType("HELP", 3, "getHelp");
    public static final WebType LOGOUT_TEXT = new WebType("LOGOUT_TEXT", 4, "getLogout");
    public static final WebType PROVIDER_DISCLAIMER = new WebType("PROVIDER_DISCLAIMER", 5, "getProviderDisclaimer");
    public static final WebType USER_SERVICE_TERMS = new WebType("USER_SERVICE_TERMS", 6, "getUserServiceTerms");
    public static final WebType GET_FREE_ADS_ALLOWANCE = new WebType("GET_FREE_ADS_ALLOWANCE", 7, "getFreeAdsAllowance");
    public static final WebType FACEBOOK = new WebType("FACEBOOK", 8, SocialMediaPrefs.SocialMediaTypes.FACEBOOK.getKey());
    public static final WebType TWITTER = new WebType("TWITTER", 9, SocialMediaPrefs.SocialMediaTypes.TWITTER.getKey());
    public static final WebType INSTAGRAM = new WebType("INSTAGRAM", 10, SocialMediaPrefs.SocialMediaTypes.INSTAGRAM.getKey());
    public static final WebType YOUTUBE = new WebType("YOUTUBE", 11, SocialMediaPrefs.SocialMediaTypes.YOUTUBE.getKey());
    public static final WebType PAYMENT = new WebType("PAYMENT", 12, "payment");
    public static final WebType Q8CAR = new WebType("Q8CAR", 13, "q8car");
    public static final WebType ADDON_HELP = new WebType("ADDON_HELP", 14, "addonhelp");
    public static final WebType WALKTHROUGHT = new WebType("WALKTHROUGHT", 15, "walkthrought");
    public static final WebType PLANS = new WebType("PLANS", 16, "PLANS");
    public static final WebType ITEM = new WebType("ITEM", 17, "item");
    public static final WebType GAM = new WebType("GAM", 18, "gam_web");
    public static final WebType DEEP_LINK = new WebType("DEEP_LINK", 19, "deep_link");
    public static final WebType PDF = new WebType("PDF", 20, Message.PDF);
    public static final WebType URL = new WebType(MessageTemplateConstants.Args.URL, 21, "url");

    /* compiled from: WebType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebType a(String type) {
            o.i(type, "type");
            Object obj = WebType.map.get(type);
            o.f(obj);
            return (WebType) obj;
        }
    }

    private static final /* synthetic */ WebType[] $values() {
        return new WebType[]{PRIVACY_POLICY, TERMS_CONDITIONS, ABOUT, HELP, LOGOUT_TEXT, PROVIDER_DISCLAIMER, USER_SERVICE_TERMS, GET_FREE_ADS_ALLOWANCE, FACEBOOK, TWITTER, INSTAGRAM, YOUTUBE, PAYMENT, Q8CAR, ADDON_HELP, WALKTHROUGHT, PLANS, ITEM, GAM, DEEP_LINK, PDF, URL};
    }

    static {
        int e11;
        int d11;
        WebType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        WebType[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (WebType webType : values) {
            linkedHashMap.put(webType.value, webType);
        }
        map = linkedHashMap;
    }

    private WebType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<WebType> getEntries() {
        return $ENTRIES;
    }

    public static WebType valueOf(String str) {
        return (WebType) Enum.valueOf(WebType.class, str);
    }

    public static WebType[] values() {
        return (WebType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
