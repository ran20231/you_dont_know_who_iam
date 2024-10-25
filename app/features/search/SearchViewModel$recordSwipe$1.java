package com.forsale.app.features.search;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$recordSwipe$1", f = "SearchViewModel.kt", l = {457}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$recordSwipe$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f36894a;

    /* renamed from: b  reason: collision with root package name */
    Object f36895b;

    /* renamed from: c  reason: collision with root package name */
    int f36896c;

    /* renamed from: d  reason: collision with root package name */
    int f36897d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36898e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f36899f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$recordSwipe$1(SearchViewModel searchViewModel, int i11, zz.a<? super SearchViewModel$recordSwipe$1> aVar) {
        super(2, aVar);
        this.f36898e = searchViewModel;
        this.f36899f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$recordSwipe$1(this.f36898e, this.f36899f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SearchViewModel searchViewModel;
        AggregatedAllAnalyticsLogger.CustomEvents customEvents;
        androidx.lifecycle.b0 b0Var;
        int i11;
        Object k12;
        int i12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i13 = this.f36897d;
        if (i13 != 0) {
            if (i13 == 1) {
                i12 = this.f36896c;
                customEvents = (AggregatedAllAnalyticsLogger.CustomEvents) this.f36895b;
                searchViewModel = (SearchViewModel) this.f36894a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            searchViewModel = this.f36898e;
            customEvents = AggregatedAllAnalyticsLogger.CustomEvents.RECOMMENDATION_SWIPED;
            b0Var = searchViewModel.K0;
            List list = (List) b0Var.getValue();
            if (list != null) {
                i11 = list.size();
            } else {
                i11 = 0;
            }
            SearchViewModel searchViewModel2 = this.f36898e;
            this.f36894a = searchViewModel;
            this.f36895b = customEvents;
            this.f36896c = i11;
            this.f36897d = 1;
            k12 = searchViewModel2.k1(this);
            if (k12 == f11) {
                return f11;
            }
            i12 = i11;
            obj = k12;
        }
        searchViewModel.H1(customEvents, i12, (String) obj, kotlin.coroutines.jvm.internal.a.d(this.f36899f + 1));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$recordSwipe$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
