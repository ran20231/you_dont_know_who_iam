package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.App;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.google.firebase.perf.metrics.Trace;
import com.leanplum.internal.ResourceQualifiers;
import cp.e;
import falcon.chat.Chat;
import g00.r;
import g00.s;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import t9.y0;
import wz.p;
/* compiled from: ChatInitializer.kt */
/* loaded from: classes2.dex */
public final class ChatInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public AggregatedAllAnalyticsLogger f37552a;

    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> e11;
        e11 = q.e(DependencyGraphInitializer.class);
        return e11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        c(context);
        return p.f75480a;
    }

    public void c(final Context context) {
        Trace e11 = e.e("appStart_initializer_chat");
        o.i(context, "context");
        a.f37573b.a(context).i(this);
        Chat.Companion companion = Chat.f55705a;
        Context applicationContext = context.getApplicationContext();
        o.g(applicationContext, "null cannot be cast to non-null type com.forsale.app.App");
        String string = context.getResources().getString(y0.Pd);
        o.h(string, "getString(...)");
        String string2 = context.getResources().getString(y0.Od);
        o.h(string2, "getString(...)");
        String string3 = context.getResources().getString(y0.T9);
        o.h(string3, "getString(...)");
        companion.q((App) applicationContext, string, string2, string3);
        ((App) context).registerActivityLifecycleCallbacks(companion.i());
        companion.s(new r<String, String, String, String, p>() { // from class: com.forsale.app.intializers.ChatInitializer$create$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(4);
            }

            public final void b(String event, String advId, String peerId, String source) {
                o.i(event, "event");
                o.i(advId, "advId");
                o.i(peerId, "peerId");
                o.i(source, "source");
                switch (event.hashCode()) {
                    case -265148636:
                        if (event.equals("event_send_audio")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHAT_ACTION_SEND_VOICE_NOTE, advId, peerId, source);
                            return;
                        }
                        return;
                    case -258001751:
                        if (event.equals("event_send_image")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHAT_ACTION_SEND_IMAGE, advId, peerId, source);
                            return;
                        }
                        return;
                    case -213975797:
                        if (event.equals("event_dialogue_opened")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHAT_SCREEN_VISITED, advId, peerId, source);
                            return;
                        }
                        return;
                    case 327068071:
                        if (event.equals("event_send_location")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHAT_ACTION_SEND_LOCATION, advId, peerId, source);
                            return;
                        }
                        return;
                    case 407640095:
                        if (event.equals("event_send_text")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHAT_ACTION_SEND_TEXT, advId, peerId, source);
                            return;
                        }
                        return;
                    case 1891481853:
                        if (event.equals("event_all_my_chats_opened")) {
                            AggregatedAllAnalyticsLoggerKt.J(ChatInitializer.this.d(), AggregatedAllAnalyticsLogger.ChatActionEvents.CHATS_SCREEN_VISITED, advId, peerId, source);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(String str, String str2, String str3, String str4) {
                b(str, str2, str3, str4);
                return p.f75480a;
            }
        });
        companion.v(new s<String, String, String, String, String, p>() { // from class: com.forsale.app.intializers.ChatInitializer$create$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            public final void b(String userId, String peerId, String itemId, String itemTitle, String itemImage) {
                o.i(userId, "userId");
                o.i(peerId, "peerId");
                o.i(itemId, "itemId");
                o.i(itemTitle, "itemTitle");
                o.i(itemImage, "itemImage");
                ListingChatActivity.a.b(ListingChatActivity.f27334y, context, userId, peerId, itemId, itemTitle, itemImage, null, null, null, null, 268435456, ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH, null);
            }

            @Override // g00.s
            public /* bridge */ /* synthetic */ p k(String str, String str2, String str3, String str4, String str5) {
                b(str, str2, str3, str4, str5);
                return p.f75480a;
            }
        });
        e11.stop();
    }

    public final AggregatedAllAnalyticsLogger d() {
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f37552a;
        if (aggregatedAllAnalyticsLogger != null) {
            return aggregatedAllAnalyticsLogger;
        }
        o.w("analyticsLogger");
        return null;
    }
}
