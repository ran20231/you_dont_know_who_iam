package com.forsale.app.datalayer.repositories;

import g00.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.s;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository$preLoadImages$2", f = "MasterDataRepository.kt", l = {385}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataRepository$preLoadImages$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends wz.p>>, Object> {
    final /* synthetic */ List<String> $media;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$preLoadImages$2(List<String> list, MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$preLoadImages$2> aVar) {
        super(2, aVar);
        this.$media = list;
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MasterDataRepository$preLoadImages$2 masterDataRepository$preLoadImages$2 = new MasterDataRepository$preLoadImages$2(this.$media, this.this$0, aVar);
        masterDataRepository$preLoadImages$2.L$0 = obj;
        return masterDataRepository$preLoadImages$2;
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends wz.p>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<wz.p>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List c02;
        int y11;
        Deferred async$default;
        boolean v11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.$media) {
                v11 = s.v((String) obj2);
                if (!v11) {
                    arrayList.add(obj2);
                }
            }
            c02 = CollectionsKt___CollectionsKt.c0(arrayList);
            List<String> list = c02;
            MasterDataRepository masterDataRepository = this.this$0;
            y11 = kotlin.collections.s.y(list, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (String str : list) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MasterDataRepository$preLoadImages$2$preLoadRequests$2$1(masterDataRepository, str, null), 3, null);
                arrayList2.add(async$default);
            }
            Deferred[] deferredArr = (Deferred[]) arrayList2.toArray(new Deferred[0]);
            this.label = 1;
            obj = AwaitKt.awaitAll((Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length), this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<wz.p>> aVar) {
        return ((MasterDataRepository$preLoadImages$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
