package com.forsale.app.features.more.notifications.appInbox;

import androidx.lifecycle.b0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.more.notifications.appInbox.AppInboxViewModel;
import com.forsale.app.utils.NotificationTypes;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumInbox;
import com.leanplum.LeanplumInboxMessage;
import com.leanplum.callbacks.InboxChangedCallback;
import com.leanplum.callbacks.InboxSyncedCallback;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.d;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wz.h;
/* compiled from: AppInboxViewModel.kt */
/* loaded from: classes2.dex */
public final class AppInboxViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final b0<List<be.c>> f32633l0;

    /* renamed from: m0  reason: collision with root package name */
    private final h f32634m0;

    /* renamed from: n0  reason: collision with root package name */
    private final LeanplumInbox f32635n0;

    /* compiled from: AppInboxViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends InboxChangedCallback {
        a() {
        }

        @Override // com.leanplum.callbacks.InboxChangedCallback
        public void inboxChanged() {
            x10.a.b("DATA CHANGED ", new Object[0]);
        }
    }

    /* compiled from: AppInboxViewModel.kt */
    /* loaded from: classes2.dex */
    public final class b extends InboxSyncedCallback {
        public b() {
        }

        @Override // com.leanplum.callbacks.InboxSyncedCallback
        public void onForceContentUpdate(boolean z11) {
            AppInboxViewModel.this.A0();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Long.valueOf(((be.c) t12).a()), Long.valueOf(((be.c) t11).a()));
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInboxViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(baseRepository, "baseRepository");
        this.f32633l0 = new b0<>();
        a11 = d.a(new g00.a<b>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxViewModel$callback$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AppInboxViewModel.b invoke() {
                return new AppInboxViewModel.b();
            }
        });
        this.f32634m0 = a11;
        LeanplumInbox inbox = Leanplum.getInbox();
        this.f32635n0 = inbox;
        inbox.addChangedHandler(new a());
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        int y11;
        boolean z11;
        List<be.c> M0;
        boolean z12;
        NotificationTypes notificationTypes;
        JSONObject data;
        String str;
        List<LeanplumInboxMessage> allMessages = this.f32635n0.allMessages();
        o.h(allMessages, "allMessages(...)");
        List<LeanplumInboxMessage> list = allMessages;
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        Iterator<T> it2 = list.iterator();
        while (true) {
            z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            LeanplumInboxMessage leanplumInboxMessage = (LeanplumInboxMessage) it2.next();
            String messageId = leanplumInboxMessage.getMessageId();
            String title = leanplumInboxMessage.getTitle();
            String subtitle = leanplumInboxMessage.getSubtitle();
            JSONObject data2 = leanplumInboxMessage.getData();
            if (data2 != null && data2.has("type")) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str2 = null;
            if (z12) {
                NotificationTypes.a aVar = NotificationTypes.Companion;
                JSONObject data3 = leanplumInboxMessage.getData();
                if (data3 != null) {
                    str = data3.getString("type");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = NotificationTypes.TEXT.getValue();
                } else {
                    o.f(str);
                }
                notificationTypes = aVar.a(str);
            } else {
                notificationTypes = NotificationTypes.TEXT;
            }
            NotificationTypes notificationTypes2 = notificationTypes;
            long time = leanplumInboxMessage.getDeliveryTimestamp().getTime();
            JSONObject data4 = leanplumInboxMessage.getData();
            if (data4 != null && data4.has("universal_link")) {
                z11 = true;
            }
            if (z11 && (data = leanplumInboxMessage.getData()) != null) {
                str2 = data.getString("universal_link");
            }
            o.f(title);
            o.f(subtitle);
            o.f(messageId);
            arrayList.add(new be.c(title, subtitle, notificationTypes2, str2, time, messageId));
        }
        M0 = CollectionsKt___CollectionsKt.M0(arrayList, new c());
        List<be.c> list2 = M0;
        if (list2 == null || list2.isEmpty()) {
            z11 = true;
        }
        if (z11) {
            v0().postValue(ViewStates.Empty);
            return;
        }
        v0().postValue(ViewStates.CONTENT);
        this.f32633l0.postValue(M0);
    }

    public final void x0() {
        this.f32635n0.downloadMessages(y0());
    }

    public final b y0() {
        return (b) this.f32634m0.getValue();
    }

    public final b0<List<be.c>> z0() {
        return this.f32633l0;
    }
}
