package com.forsale.app.utils.facades;

import android.content.Context;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.zendesk.logger.Logger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.p;
import zendesk.chat.Chat;
import zendesk.chat.ChatConfiguration;
import zendesk.chat.ChatEngine;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.messaging.MessagingActivity;
import zendesk.support.Support;
/* compiled from: ZendeskSupport.kt */
/* loaded from: classes3.dex */
public final class ZendeskSupport implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40114a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f40115b;

    /* renamed from: c  reason: collision with root package name */
    private final UserProfileInteractor f40116c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40117d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40118e;

    /* renamed from: f  reason: collision with root package name */
    private final String f40119f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40120g;

    /* renamed from: h  reason: collision with root package name */
    private final String f40121h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<UserEntity> f40122i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<UserEntity> f40123j;

    /* renamed from: x  reason: collision with root package name */
    private final MutableStateFlow<UserStatus> f40124x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<UserStatus> f40125y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f40113z = new a(null);
    public static final int A = 8;
    private static final long B = 23112810;
    private static final long C = 23112830;
    private static final long D = 22944784;
    private static final long E = 333756990375L;
    private static final long F = 333756990076L;
    private static final long G = 22944804;
    private static final String H = "Device Id";
    private static final String I = "App Name";
    private static final String J = "Version";
    private static final String K = "Mobile Number";
    private static final String L = "User SessionStatus";
    private static final String M = "Device Name";
    private static final String N = "Device Model";
    private static final String O = "Device Model Name";

    /* compiled from: ZendeskSupport.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(TypeExtensionsKt.g0(th2), new Object[0]);
        }
    }

    public ZendeskSupport(Context applicationContext, jj.b prefs, UserProfileInteractor userProfileInteractor) {
        o.i(applicationContext, "applicationContext");
        o.i(prefs, "prefs");
        o.i(userProfileInteractor, "userProfileInteractor");
        this.f40114a = applicationContext;
        this.f40115b = prefs;
        this.f40116c = userProfileInteractor;
        jj.a aVar = jj.a.f60556a;
        this.f40117d = aVar.a();
        this.f40118e = aVar.e();
        String d11 = aVar.d();
        o.h(d11, "<get-DEVICE_NAME>(...)");
        this.f40119f = d11;
        String c11 = aVar.c();
        o.h(c11, "<get-DEVICE_MODEL>(...)");
        this.f40120g = c11;
        this.f40121h = aVar.b();
        MutableStateFlow<UserEntity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f40122i = MutableStateFlow;
        this.f40123j = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<UserStatus> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f40124x = MutableStateFlow2;
        this.f40125y = FlowKt.asStateFlow(MutableStateFlow2);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(zz.a<? super java.util.List<? extends zendesk.support.CustomField>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.utils.facades.ZendeskSupport$getCustomFields$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.utils.facades.ZendeskSupport$getCustomFields$1 r0 = (com.forsale.app.utils.facades.ZendeskSupport$getCustomFields$1) r0
            int r1 = r0.f40136g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40136g = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.ZendeskSupport$getCustomFields$1 r0 = new com.forsale.app.utils.facades.ZendeskSupport$getCustomFields$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40134e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40136g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.f40133d
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r2 = r0.f40132c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f40131b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r0 = r0.f40130a
            com.forsale.app.utils.facades.ZendeskSupport r0 = (com.forsale.app.utils.facades.ZendeskSupport) r0
            kotlin.f.b(r7)
            goto L84
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            kotlin.f.b(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zendesk.support.CustomField r7 = new zendesk.support.CustomField
            long r4 = com.forsale.app.utils.facades.ZendeskSupport.C
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.a.e(r4)
            java.lang.String r5 = r6.f40117d
            r7.<init>(r4, r5)
            r2.add(r7)
            zendesk.support.CustomField r7 = new zendesk.support.CustomField
            long r4 = com.forsale.app.utils.facades.ZendeskSupport.D
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.a.e(r4)
            java.lang.String r5 = r6.f40118e
            r7.<init>(r4, r5)
            r2.add(r7)
            long r4 = com.forsale.app.utils.facades.ZendeskSupport.B
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.a.e(r4)
            r0.f40130a = r6
            r0.f40131b = r2
            r0.f40132c = r2
            r0.f40133d = r7
            r0.f40136g = r3
            java.lang.Object r0 = r6.h(r0)
            if (r0 != r1) goto L80
            return r1
        L80:
            r1 = r7
            r7 = r0
            r3 = r2
            r0 = r6
        L84:
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r4.<init>(r1, r7)
            r2.add(r4)
            zendesk.support.CustomField r7 = new zendesk.support.CustomField
            long r1 = com.forsale.app.utils.facades.ZendeskSupport.G
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.a.e(r1)
            com.forsale.app.utils.e$a r2 = com.forsale.app.utils.e.f40106a
            java.lang.String r2 = r2.a()
            r7.<init>(r1, r2)
            r3.add(r7)
            zendesk.support.CustomField r7 = new zendesk.support.CustomField
            long r1 = com.forsale.app.utils.facades.ZendeskSupport.F
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.a.e(r1)
            kotlinx.coroutines.flow.StateFlow<com.forsale.app.features.auth.UserStatus> r2 = r0.f40125y
            java.lang.Object r2 = r2.getValue()
            r7.<init>(r1, r2)
            r3.add(r7)
            zendesk.support.CustomField r7 = new zendesk.support.CustomField
            long r1 = com.forsale.app.utils.facades.ZendeskSupport.E
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.a.e(r1)
            kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.database.UserEntity> r0 = r0.f40123j
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.datalayer.database.UserEntity r0 = (com.forsale.app.datalayer.database.UserEntity) r0
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.getPhone()
            goto Lcc
        Lcb:
            r0 = 0
        Lcc:
            r7.<init>(r1, r0)
            r3.add(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.ZendeskSupport.j(zz.a):java.lang.Object");
    }

    private final void l() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$loadUserdata$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(String str, zz.a<? super p> aVar) {
        String str2;
        Identity build;
        if (this.f40125y.getValue() == UserStatus.LoggedIn) {
            build = new AnonymousIdentity.Builder().withEmailIdentifier(str).build();
            o.f(build);
        } else {
            AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
            UserEntity value = this.f40123j.getValue();
            String str3 = null;
            if (value != null) {
                str2 = value.getFirstName();
            } else {
                str2 = null;
            }
            String string = this.f40114a.getString(y0.f70716v4);
            o.h(string, "getString(...)");
            AnonymousIdentity.Builder withNameIdentifier = builder.withNameIdentifier(TypeExtensionsKt.U0(str2, string));
            UserEntity value2 = this.f40123j.getValue();
            if (value2 != null) {
                str3 = value2.getEmail();
            }
            build = withNameIdentifier.withEmailIdentifier(str3).build();
            o.f(build);
        }
        Zendesk.INSTANCE.setIdentity(build);
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r20, zz.a<? super wz.p> r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.ZendeskSupport.t(java.lang.String, zz.a):java.lang.Object");
    }

    public void g(Context context) {
        o.i(context, "context");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$createTicket$1(this, context, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key));
    }

    public final Object h(zz.a<? super String> aVar) {
        return this.f40115b.c().a(aVar);
    }

    public void k() {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        Context context = this.f40114a;
        zendesk2.init(context, context.getString(y0.f70629pf), this.f40114a.getString(y0.f70612of), this.f40114a.getString(y0.f70595nf));
        Support.INSTANCE.init(zendesk2);
        Chat chat = Chat.INSTANCE;
        Context context2 = this.f40114a;
        chat.init(context2, context2.getString(y0.f70646qf));
        Logger.j(true);
    }

    public void m(Context context) {
        o.i(context, "context");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$myTickets$1(this, context, null), 3, null);
    }

    public void o(Context context) {
        o.i(context, "context");
        MessagingActivity.builder().withEngines(ChatEngine.engine()).show(context, ChatConfiguration.builder().build());
    }

    public void p(Context context) {
        o.i(context, "context");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$showFAQs$1(this, context, null), 3, null);
    }

    public void q(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$updateLiveChatInformation$1(this, str, null), 3, null);
    }

    public void r(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ZendeskSupport$updateSupportUserInformation$1(this, str, null), 3, null);
    }
}
