package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.interactors.TrendingClickInteractor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$onTrendsItemClicked$1", f = "SearchFocusViewModel.kt", l = {349, 348}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$onTrendsItemClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f36788a;

    /* renamed from: b  reason: collision with root package name */
    int f36789b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36790c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SearchItemModel f36791d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TrendEntity f36792e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f36793f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$onTrendsItemClicked$1(SearchFocusViewModel searchFocusViewModel, SearchItemModel searchItemModel, TrendEntity trendEntity, String str, zz.a<? super SearchFocusViewModel$onTrendsItemClicked$1> aVar) {
        super(2, aVar);
        this.f36790c = searchFocusViewModel;
        this.f36791d = searchItemModel;
        this.f36792e = trendEntity;
        this.f36793f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$onTrendsItemClicked$1(this.f36790c, this.f36791d, this.f36792e, this.f36793f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Channel channel;
        TrendingClickInteractor trendingClickInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36789b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) this.f36788a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            channel = this.f36790c.H0;
            trendingClickInteractor = this.f36790c.f36710u0;
            SearchItemModel searchItemModel = this.f36791d;
            SearchAnalyticsData c11 = SearchAnalyticsData.f36633x.c(this.f36790c.U0(), this.f36791d, kotlin.coroutines.jvm.internal.a.d(this.f36790c.U0().i().indexOf(this.f36792e)), SearchAnalyticsData.SearchSource.TRENDING);
            String str = this.f36793f;
            this.f36788a = channel;
            this.f36789b = 1;
            obj = TrendingClickInteractor.e(trendingClickInteractor, searchItemModel, c11, str, null, null, this, 24, null);
            if (obj == f11) {
                return f11;
            }
        }
        this.f36788a = null;
        this.f36789b = 2;
        if (channel.send(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$onTrendsItemClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
