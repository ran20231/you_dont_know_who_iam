package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.features.more.user.editprofile.analytics.DeleteAccountClickedEvent;
import com.forsale.app.features.more.user.editprofile.analytics.EditProfileClickedEvent;
import com.forsale.app.features.more.user.editprofile.analytics.EditProfileImageClickedEvent;
import com.forsale.app.features.more.user.editprofile.analytics.EditProfileSaveClickedEvent;
import com.forsale.app.features.more.user.editprofile.analytics.MyProfileChangePasswordClickedAnalyticsEvent;
import com.forsale.app.features.more.user.editprofile.analytics.MyProfileChangePasswordSaveClickedAnalyticsEvent;
import com.forsale.app.features.more.user.editprofile.analytics.MyProfileEditSavedEvent;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: EditProfileAnalyticsInteractor.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f33132a;

    /* renamed from: b  reason: collision with root package name */
    private final ForSaleDataTracker f33133b;

    public b(AggregatedAllAnalyticsLogger analyticsLogger, ForSaleDataTracker tracker) {
        o.i(analyticsLogger, "analyticsLogger");
        o.i(tracker, "tracker");
        this.f33132a = analyticsLogger;
        this.f33133b = tracker;
    }

    public final Object a(DeleteAccountClickedEvent deleteAccountClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(deleteAccountClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final void b(xi.a editProfileChangeImageSucceededEvent) {
        Map h11;
        o.i(editProfileChangeImageSucceededEvent, "editProfileChangeImageSucceededEvent");
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(this.f33132a, "Edit Profile Change Image Succeeded", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final Object c(EditProfileClickedEvent editProfileClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(editProfileClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object d(EditProfileImageClickedEvent editProfileImageClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(editProfileImageClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object e(EditProfileSaveClickedEvent editProfileSaveClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(editProfileSaveClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object f(MyProfileChangePasswordClickedAnalyticsEvent myProfileChangePasswordClickedAnalyticsEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(myProfileChangePasswordClickedAnalyticsEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object g(MyProfileChangePasswordSaveClickedAnalyticsEvent myProfileChangePasswordSaveClickedAnalyticsEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(myProfileChangePasswordSaveClickedAnalyticsEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object h(MyProfileEditSavedEvent myProfileEditSavedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33133b.a(myProfileEditSavedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }
}
