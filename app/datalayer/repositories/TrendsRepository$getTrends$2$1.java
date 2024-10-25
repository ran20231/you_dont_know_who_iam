package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.network.responses.TrendsResponseBody;
import com.google.android.gms.maps.model.PinConfig;
import g00.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrendsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$2$1", f = "TrendsRepository.kt", l = {PinConfig.BITMAP_LENGTH_DP, 38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TrendsRepository$getTrends$2$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {
    final /* synthetic */ TrendsResponseBody $this_apply;
    Object L$0;
    int label;
    final /* synthetic */ TrendsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendsRepository$getTrends$2$1(TrendsRepository trendsRepository, TrendsResponseBody trendsResponseBody, zz.a<? super TrendsRepository$getTrends$2$1> aVar) {
        super(1, aVar);
        this.this$0 = trendsRepository;
        this.$this_apply = trendsResponseBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new TrendsRepository$getTrends$2$1(this.this$0, this.$this_apply, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List<TrendEntity> mapTrendsResponse;
        TrendDao trendDao;
        TrendDao trendDao2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mapTrendsResponse = (List) this.L$0;
            f.b(obj);
        } else {
            f.b(obj);
            mapTrendsResponse = this.this$0.mapTrendsResponse(this.$this_apply);
            trendDao = this.this$0.trendDao;
            this.L$0 = mapTrendsResponse;
            this.label = 1;
            if (trendDao.deleteAll(this) == f11) {
                return f11;
            }
        }
        trendDao2 = this.this$0.trendDao;
        this.L$0 = null;
        this.label = 2;
        if (trendDao2.insertAll(mapTrendsResponse, this) == f11) {
            return f11;
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((TrendsRepository$getTrends$2$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
