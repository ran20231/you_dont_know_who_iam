package com.forsale.app.features.webBrowser.jsCommunicationInterfaces;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import g00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: PLFCommunication.kt */
/* loaded from: classes2.dex */
public final class PLFCommunication implements hf.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f37110f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f37111g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final l<PLFResultAction, p> f37112a;

    /* renamed from: b  reason: collision with root package name */
    private final g00.a<p> f37113b;

    /* renamed from: c  reason: collision with root package name */
    private final g00.a<p> f37114c;

    /* renamed from: d  reason: collision with root package name */
    private final l<String, p> f37115d;

    /* renamed from: e  reason: collision with root package name */
    private WebView f37116e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PLFCommunication.kt */
    /* loaded from: classes2.dex */
    public static final class PLFResultAction {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ PLFResultAction[] $VALUES;
        public static final a Companion;
        public static final PLFResultAction NONE = new PLFResultAction("NONE", 0, "none");
        public static final PLFResultAction REFRESH = new PLFResultAction("REFRESH", 1, "refresh");
        private final String value;

        /* compiled from: PLFCommunication.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PLFResultAction a(String value) {
                PLFResultAction pLFResultAction;
                o.i(value, "value");
                PLFResultAction[] values = PLFResultAction.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        pLFResultAction = values[i11];
                        if (o.d(pLFResultAction.getValue(), value)) {
                            break;
                        }
                        i11++;
                    } else {
                        pLFResultAction = null;
                        break;
                    }
                }
                if (pLFResultAction == null) {
                    return PLFResultAction.NONE;
                }
                return pLFResultAction;
            }
        }

        private static final /* synthetic */ PLFResultAction[] $values() {
            return new PLFResultAction[]{NONE, REFRESH};
        }

        static {
            PLFResultAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private PLFResultAction(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<PLFResultAction> getEntries() {
            return $ENTRIES;
        }

        public static PLFResultAction valueOf(String str) {
            return (PLFResultAction) Enum.valueOf(PLFResultAction.class, str);
        }

        public static PLFResultAction[] values() {
            return (PLFResultAction[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: PLFCommunication.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PLFCommunication(l<? super PLFResultAction, p> exitPLFFlow, g00.a<p> openSupportScreen, g00.a<p> goToMyListingsScreen, l<? super String, p> openKNetFlow) {
        o.i(exitPLFFlow, "exitPLFFlow");
        o.i(openSupportScreen, "openSupportScreen");
        o.i(goToMyListingsScreen, "goToMyListingsScreen");
        o.i(openKNetFlow, "openKNetFlow");
        this.f37112a = exitPLFFlow;
        this.f37113b = openSupportScreen;
        this.f37114c = goToMyListingsScreen;
        this.f37115d = openKNetFlow;
    }

    @Override // hf.a
    public void a(WebView webView) {
        this.f37116e = webView;
    }

    public WebView b() {
        return this.f37116e;
    }

    public final void c() {
        WebView b11 = b();
        if (b11 != null) {
            b11.evaluateJavascript("paymentCompleted()", null);
        }
    }

    @JavascriptInterface
    public final void exitPLF(String resultAction) {
        o.i(resultAction, "resultAction");
        this.f37112a.invoke(PLFResultAction.Companion.a(resultAction));
    }

    @Override // hf.a
    public String getName() {
        return "PLFBullet";
    }

    @JavascriptInterface
    public final void goToMyListings() {
        this.f37114c.invoke();
    }

    @JavascriptInterface
    public final void goToSupportScreen() {
        this.f37113b.invoke();
    }

    @JavascriptInterface
    public final void payWithKnet(String kNetUrl) {
        o.i(kNetUrl, "kNetUrl");
        this.f37115d.invoke(kNetUrl);
    }
}
