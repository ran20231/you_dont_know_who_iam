package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState;
import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$onItemCTAClicked$1", f = "FollowersAndFollowingsViewModel.kt", l = {219, 221, 227, 229}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$onItemCTAClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32238a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<CTAsState> f32239b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32240c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f32241d;

    /* compiled from: FollowersAndFollowingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32242a;

        static {
            int[] iArr = new int[CTAsState.values().length];
            try {
                iArr[CTAsState.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CTAsState.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32242a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$onItemCTAClicked$1(k0<CTAsState> k0Var, FollowersAndFollowingsViewModel followersAndFollowingsViewModel, String str, zz.a<? super FollowersAndFollowingsViewModel$onItemCTAClicked$1> aVar) {
        super(2, aVar);
        this.f32239b = k0Var;
        this.f32240c = followersAndFollowingsViewModel;
        this.f32241d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$onItemCTAClicked$1(this.f32239b, this.f32240c, this.f32241d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object I;
        Object I2;
        Object B;
        Object O;
        f11 = b.f();
        int i11 = this.f32238a;
        try {
            try {
            } catch (Exception e11) {
                FollowersAndFollowingsViewModel followersAndFollowingsViewModel = this.f32240c;
                k0<CTAsState> k0Var = this.f32239b;
                CTAsState cTAsState = CTAsState.FOLLOW;
                this.f32238a = 2;
                I2 = followersAndFollowingsViewModel.I(e11, k0Var, cTAsState, this);
                if (I2 == f11) {
                    return f11;
                }
            }
        } catch (Exception e12) {
            FollowersAndFollowingsViewModel followersAndFollowingsViewModel2 = this.f32240c;
            k0<CTAsState> k0Var2 = this.f32239b;
            CTAsState cTAsState2 = CTAsState.FOLLOWING;
            this.f32238a = 4;
            I = followersAndFollowingsViewModel2.I(e12, k0Var2, cTAsState2, this);
            if (I == f11) {
                return f11;
            }
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        return wz.p.f75480a;
                    }
                }
                f.b(obj);
                return wz.p.f75480a;
            }
            f.b(obj);
            return wz.p.f75480a;
        }
        f.b(obj);
        int i12 = a.f32242a[this.f32239b.getValue().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                FollowersAndFollowingsViewModel followersAndFollowingsViewModel3 = this.f32240c;
                String str = this.f32241d;
                this.f32238a = 3;
                O = followersAndFollowingsViewModel3.O(str, this);
                if (O == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
        FollowersAndFollowingsViewModel followersAndFollowingsViewModel4 = this.f32240c;
        String str2 = this.f32241d;
        this.f32238a = 1;
        B = followersAndFollowingsViewModel4.B(str2, this);
        if (B == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$onItemCTAClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
