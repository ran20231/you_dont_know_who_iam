package com.forsale.app.features.postad;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$postMediaUpload$1", f = "PostAdViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$postMediaUpload$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34106a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34107b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String[] f34108c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f34109d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$postMediaUpload$1(PostAdViewModel postAdViewModel, String[] strArr, String str, zz.a<? super PostAdViewModel$postMediaUpload$1> aVar) {
        super(2, aVar);
        this.f34107b = postAdViewModel;
        this.f34108c = strArr;
        this.f34109d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$postMediaUpload$1(this.f34107b, this.f34108c, this.f34109d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        ArrayList<String> arrayList;
        List t02;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f34106a == 0) {
            kotlin.f.b(obj);
            ListingDetailsEntity n22 = this.f34107b.n2();
            if (n22 != null) {
                String[] strArr = this.f34108c;
                if (strArr != null) {
                    PostAdViewModel postAdViewModel = this.f34107b;
                    t02 = ArraysKt___ArraysKt.t0(strArr);
                    arrayList = postAdViewModel.Y3(new ArrayList(t02));
                } else {
                    arrayList = null;
                }
                n22.setMediaData(arrayList, this.f34109d);
            }
            this.f34107b.I4();
            b0Var = this.f34107b.f33920a1;
            b0Var.postValue(kotlin.coroutines.jvm.internal.a.a(true));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$postMediaUpload$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
