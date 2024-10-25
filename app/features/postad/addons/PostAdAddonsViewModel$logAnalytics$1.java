package com.forsale.app.features.postad.addons;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$logAnalytics$1", f = "PostAdAddonsViewModel.kt", l = {367, 364}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34347a;

    /* renamed from: b  reason: collision with root package name */
    Object f34348b;

    /* renamed from: c  reason: collision with root package name */
    Object f34349c;

    /* renamed from: d  reason: collision with root package name */
    Object f34350d;

    /* renamed from: e  reason: collision with root package name */
    int f34351e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34352f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34353g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f34354h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ boolean f34355i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$logAnalytics$1(PostAdAddonsViewModel postAdAddonsViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, zz.a<? super PostAdAddonsViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f34352f = postAdAddonsViewModel;
        this.f34353g = createEditAdvActionType;
        this.f34354h = str;
        this.f34355i = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsViewModel$logAnalytics$1(this.f34352f, this.f34353g, this.f34354h, this.f34355i, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger r11;
        CreateEditAdvActionType createEditAdvActionType;
        ListingDetailsEntity listingDetailsEntity;
        UserEntity value;
        Object x32;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34351e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createEditAdvActionType = (CreateEditAdvActionType) this.f34348b;
            f.b(obj);
            value = (UserEntity) this.f34350d;
            r11 = (AggregatedAllAnalyticsLogger) this.f34347a;
            listingDetailsEntity = (ListingDetailsEntity) this.f34349c;
            x32 = obj;
        } else {
            f.b(obj);
            r11 = this.f34352f.r();
            createEditAdvActionType = this.f34353g;
            listingDetailsEntity = this.f34352f.f34325r0;
            value = this.f34352f.e1().a3().getValue();
            PostAdViewModel e12 = this.f34352f.e1();
            this.f34347a = r11;
            this.f34348b = createEditAdvActionType;
            this.f34349c = listingDetailsEntity;
            this.f34350d = value;
            this.f34351e = 1;
            x32 = e12.x3(this);
            if (x32 == f11) {
                return f11;
            }
        }
        boolean booleanValue = ((Boolean) x32).booleanValue();
        String str = this.f34354h;
        boolean z11 = this.f34355i;
        this.f34347a = null;
        this.f34348b = null;
        this.f34349c = null;
        this.f34350d = null;
        this.f34351e = 2;
        if (AggregatedAllAnalyticsLoggerKt.M(r11, createEditAdvActionType, listingDetailsEntity, value, booleanValue, str, null, null, null, z11, this, 224, null) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
