package com.forsale.app.features.postad;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$logOnNextClicked$1", f = "PostAdViewModel.kt", l = {1022}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$logOnNextClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34099c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l.b f34100d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$logOnNextClicked$1(PostAdViewModel postAdViewModel, CreateEditAdvActionType createEditAdvActionType, l.b bVar, zz.a<? super PostAdViewModel$logOnNextClicked$1> aVar) {
        super(2, aVar);
        this.f34098b = postAdViewModel;
        this.f34099c = createEditAdvActionType;
        this.f34100d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$logOnNextClicked$1(this.f34098b, this.f34099c, this.f34100d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34097a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsEntity value = this.f34098b.p2().getValue();
            if (value != null) {
                PostAdViewModel postAdViewModel = this.f34098b;
                CreateEditAdvActionType createEditAdvActionType = this.f34099c;
                l.b bVar = this.f34100d;
                AggregatedAllAnalyticsLogger r11 = postAdViewModel.r();
                int id2 = value.getId();
                CategoryEntity category = value.getCategory();
                this.f34097a = 1;
                if (AggregatedAllAnalyticsLoggerKt.r0(r11, createEditAdvActionType, category, id2, bVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$logOnNextClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
