package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$updateCacheWith$1", f = "PostAdExtraInfoViewModel.kt", l = {460}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$updateCacheWith$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35551a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35552b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Set<String> f35553c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$updateCacheWith$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, Set<String> set, zz.a<? super PostAdExtraInfoViewModel$updateCacheWith$1> aVar) {
        super(2, aVar);
        this.f35552b = postAdExtraInfoViewModel;
        this.f35553c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$updateCacheWith$1(this.f35552b, this.f35553c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdRepository postAdRepository;
        String t02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35551a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingDetailsEntity n22 = this.f35552b.o1().n2();
            if (n22 != null) {
                PostAdExtraInfoViewModel postAdExtraInfoViewModel = this.f35552b;
                Set<String> set = this.f35553c;
                PostAdViewModel o12 = postAdExtraInfoViewModel.o1();
                t02 = CollectionsKt___CollectionsKt.t0(set, ",", null, null, 0, null, null, 62, null);
                n22.setContactNo(t02);
                o12.L4(n22);
            }
            postAdRepository = this.f35552b.f35488p0;
            Set<String> set2 = this.f35553c;
            this.f35551a = 1;
            if (postAdRepository.g(set2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$updateCacheWith$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
