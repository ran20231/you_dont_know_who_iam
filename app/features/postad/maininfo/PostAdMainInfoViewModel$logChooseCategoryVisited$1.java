package com.forsale.app.features.postad.maininfo;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$logChooseCategoryVisited$1", f = "PostAdMainInfoViewModel.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$logChooseCategoryVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35883b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35884c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$logChooseCategoryVisited$1(PostAdMainInfoViewModel postAdMainInfoViewModel, String str, zz.a<? super PostAdMainInfoViewModel$logChooseCategoryVisited$1> aVar) {
        super(2, aVar);
        this.f35883b = postAdMainInfoViewModel;
        this.f35884c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$logChooseCategoryVisited$1(this.f35883b, this.f35884c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35882a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdViewModel O0 = this.f35883b.O0();
            AggregatedAllAnalyticsLogger.CustomEvents customEvents = AggregatedAllAnalyticsLogger.CustomEvents.CHOOSE_CATEGORY_VISITED;
            String str = this.f35884c;
            this.f35882a = 1;
            if (O0.M3(customEvents, str, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$logChooseCategoryVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
