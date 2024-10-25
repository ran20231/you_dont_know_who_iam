package com.forsale.app.features.postad;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.PLFMediaTypes;
import com.forsale.app.utils.analytics.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$logMediaAnalytics$1", f = "PostAdViewModel.kt", l = {1010}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$logMediaAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34091a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34092b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34093c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PLFMediaTypes f34094d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l.a f34095e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f34096f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$logMediaAnalytics$1(PostAdViewModel postAdViewModel, CreateEditAdvActionType createEditAdvActionType, PLFMediaTypes pLFMediaTypes, l.a aVar, boolean z11, zz.a<? super PostAdViewModel$logMediaAnalytics$1> aVar2) {
        super(2, aVar2);
        this.f34092b = postAdViewModel;
        this.f34093c = createEditAdvActionType;
        this.f34094d = pLFMediaTypes;
        this.f34095e = aVar;
        this.f34096f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$logMediaAnalytics$1(this.f34092b, this.f34093c, this.f34094d, this.f34095e, this.f34096f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Boolean bool;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34091a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsEntity value = this.f34092b.p2().getValue();
            if (value != null) {
                PostAdViewModel postAdViewModel = this.f34092b;
                CreateEditAdvActionType createEditAdvActionType = this.f34093c;
                PLFMediaTypes pLFMediaTypes = this.f34094d;
                l.a aVar = this.f34095e;
                boolean z12 = this.f34096f;
                AggregatedAllAnalyticsLogger r11 = postAdViewModel.r();
                if (z12) {
                    if (value.getId() == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bool = kotlin.coroutines.jvm.internal.a.a(z11);
                } else {
                    bool = null;
                }
                this.f34091a = 1;
                if (AggregatedAllAnalyticsLoggerKt.s0(r11, createEditAdvActionType, value, pLFMediaTypes, aVar, bool, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$logMediaAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
