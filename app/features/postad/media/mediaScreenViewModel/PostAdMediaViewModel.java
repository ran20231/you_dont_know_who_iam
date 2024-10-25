package com.forsale.app.features.postad.media.mediaScreenViewModel;

import android.webkit.URLUtil;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z;
import bf.b;
import bf.k;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdRepository;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.media.MediaStates;
import com.forsale.app.features.postad.media.MediaTypes;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.PLFMediaTypes;
import com.forsale.app.utils.analytics.l;
import dj.g;
import g00.l;
import g00.p;
import j0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: PostAdMediaViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final PostAdViewModel f36282k0;

    /* renamed from: l0  reason: collision with root package name */
    private final g f36283l0;

    /* renamed from: m0  reason: collision with root package name */
    private final PostAdRepository f36284m0;

    /* renamed from: n0  reason: collision with root package name */
    private final SnapshotStateList<bf.a> f36285n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<VideoItemViewModel> f36286o0;

    /* renamed from: p0  reason: collision with root package name */
    private final LiveData<VideoItemViewModel> f36287p0;

    /* renamed from: q0  reason: collision with root package name */
    private final z<Boolean> f36288q0;

    /* renamed from: r0  reason: collision with root package name */
    private final LiveData<bf.b> f36289r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableSharedFlow<k> f36290s0;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<k> f36291t0;

    /* renamed from: u0  reason: collision with root package name */
    private final k0<Integer> f36292u0;

    /* renamed from: v0  reason: collision with root package name */
    private bf.a f36293v0;

    /* compiled from: PostAdMediaViewModel.kt */
    @d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$1", f = "PostAdMediaViewModel.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36294a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f36294a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                PostAdMediaViewModel postAdMediaViewModel = PostAdMediaViewModel.this;
                this.f36294a = 1;
                if (postAdMediaViewModel.C0(this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: PostAdMediaViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PostAdMediaViewModel a(PostAdViewModel postAdViewModel);
    }

    /* compiled from: PostAdMediaViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36301a;

        static {
            int[] iArr = new int[MediaStates.values().length];
            try {
                iArr[MediaStates.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaStates.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36301a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdMediaViewModel f36302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, PostAdMediaViewModel postAdMediaViewModel) {
            super(key);
            this.f36302a = postAdMediaViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
            this.f36302a.f36286o0.postValue(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel(PostAdViewModel postAdViewModel, g mediaCompressor, PostAdRepository postAdRepository, BaseRepository baseRepository) {
        super(baseRepository);
        k0<Integer> e11;
        o.i(postAdViewModel, "postAdViewModel");
        o.i(mediaCompressor, "mediaCompressor");
        o.i(postAdRepository, "postAdRepository");
        o.i(baseRepository, "baseRepository");
        this.f36282k0 = postAdViewModel;
        this.f36283l0 = mediaCompressor;
        this.f36284m0 = postAdRepository;
        this.f36285n0 = androidx.compose.runtime.z.f();
        b0<VideoItemViewModel> b0Var = new b0<>();
        this.f36286o0 = b0Var;
        this.f36287p0 = b0Var;
        this.f36288q0 = new z<>();
        this.f36289r0 = Transformations.b(postAdViewModel.d2(), new l<CategoryRuleSet.RuleSet, bf.b>() { // from class: com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$mediaScreenConfiguration$1
            @Override // g00.l
            /* renamed from: b */
            public final b invoke(CategoryRuleSet.RuleSet it2) {
                boolean z11;
                int i11;
                boolean z12;
                int i12;
                long j11;
                CategoryRuleSet.VideoConfiguration video;
                CategoryRuleSet.VideoConfiguration video2;
                CategoryRuleSet.VideoConfiguration video3;
                CategoryRuleSet.ImageConfiguration images;
                CategoryRuleSet.ImageConfiguration images2;
                o.i(it2, "it");
                CategoryRuleSet.MediaConfiguration media = it2.getMedia();
                if (media != null && (images2 = media.getImages()) != null && images2.getPrimaryRequired()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                CategoryRuleSet.MediaConfiguration media2 = it2.getMedia();
                if (media2 != null && (images = media2.getImages()) != null) {
                    i11 = images.getMaxImages();
                } else {
                    i11 = 0;
                }
                CategoryRuleSet.MediaConfiguration media3 = it2.getMedia();
                if (media3 != null && (video3 = media3.getVideo()) != null && video3.getEnabled()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                CategoryRuleSet.MediaConfiguration media4 = it2.getMedia();
                if (media4 != null && (video2 = media4.getVideo()) != null) {
                    i12 = video2.getMaxLengthSeconds();
                } else {
                    i12 = 15;
                }
                int i13 = i12;
                CategoryRuleSet.MediaConfiguration media5 = it2.getMedia();
                if (media5 != null && (video = media5.getVideo()) != null) {
                    j11 = video.getMaxSizeKb();
                } else {
                    j11 = 10485760;
                }
                return new b(false, z11, i11, z12, i13, j11);
            }
        });
        MutableSharedFlow<k> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f36290s0 = MutableSharedFlow$default;
        this.f36291t0 = MutableSharedFlow$default;
        f1();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        e11 = c0.e(null, null, 2, null);
        this.f36292u0 = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$checkForNotViewedImageTutorials$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$checkForNotViewedImageTutorials$1 r0 = (com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$checkForNotViewedImageTutorials$1) r0
            int r1 = r0.f36306d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36306d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$checkForNotViewedImageTutorials$1 r0 = new com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$checkForNotViewedImageTutorials$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f36304b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36306d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f36303a
            com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel r0 = (com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel) r0
            kotlin.f.b(r5)
            goto L58
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f36282k0
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = r5.n2()
            if (r5 == 0) goto L82
            java.lang.Integer r5 = r5.getCategoryId()
            if (r5 == 0) goto L82
            int r5 = r5.intValue()
            com.forsale.app.features.postad.PostAdRepository r2 = r4.f36284m0
            r0.f36303a = r4
            r0.f36306d = r3
            java.lang.Object r5 = r2.f(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r4
        L58:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L82
            com.forsale.app.features.postad.PostAdViewModel r5 = r0.f36282k0
            androidx.lifecycle.LiveData r5 = r5.d2()
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r5 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r5
            if (r5 == 0) goto L79
            com.forsale.app.datalayer.database.CategoryRuleSet$MediaConfiguration r5 = r5.getMedia()
            if (r5 == 0) goto L79
            java.util.List r5 = r5.getTutorials()
            goto L7a
        L79:
            r5 = 0
        L7a:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L82
            boolean r5 = r5.isEmpty()
        L82:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel.C0(zz.a):java.lang.Object");
    }

    private final void K0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdMediaViewModel$handleImageFailure$1(this, null), 3, null);
    }

    private final void L0() {
        String videoUrl;
        ListingDetailsEntity n22 = this.f36282k0.n2();
        if (n22 != null && (videoUrl = n22.getVideoUrl()) != null) {
            if (!(!URLUtil.isNetworkUrl(videoUrl))) {
                videoUrl = null;
            }
            if (videoUrl != null) {
                j1();
            }
        }
        this.f36282k0.A4(MediaTypes.IMAGES, MediaStates.INITIAL);
        this.f36282k0.N1(PostAdScreens.MEDIA_SCREEN);
    }

    public static /* synthetic */ void P0(PostAdMediaViewModel postAdMediaViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postAdMediaViewModel.O0(z11);
    }

    public static /* synthetic */ void R0(PostAdMediaViewModel postAdMediaViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postAdMediaViewModel.Q0(z11);
    }

    private final void f1() {
        ArrayList<String> arrayList;
        boolean z11;
        int y11;
        String videoUrl;
        ListingDetailsEntity n22 = this.f36282k0.n2();
        if (n22 != null && (videoUrl = n22.getVideoUrl()) != null) {
            this.f36286o0.postValue(new VideoItemViewModel(videoUrl, null, 2, null));
        }
        ListingDetailsEntity n23 = this.f36282k0.n2();
        if (n23 != null) {
            arrayList = n23.getImageUrls();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f36285n0.clear();
            SnapshotStateList<bf.a> snapshotStateList = this.f36285n0;
            y11 = s.y(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (String str : arrayList) {
                arrayList2.add(new bf.a(str, null, 2, null));
            }
            snapshotStateList.addAll(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(VideoItemViewModel videoItemViewModel) {
        Job d11 = videoItemViewModel.d();
        if (d11 != null) {
            if (!d11.isActive()) {
                d11 = null;
            }
            if (d11 != null) {
                Job.DefaultImpls.cancel$default(d11, null, 1, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r5 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h1() {
        /*
            r11 = this;
            androidx.compose.runtime.snapshots.SnapshotStateList<bf.a> r0 = r11.f36285n0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.p.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            bf.a r2 = (bf.a) r2
            java.lang.String r2 = r2.e()
            r1.add(r2)
            goto L11
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L32
            goto L33
        L32:
            r0 = r2
        L33:
            androidx.lifecycle.LiveData<com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel> r1 = r11.f36287p0
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel r1 = (com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel) r1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L51
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L51
            int r5 = r1.length()
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r3
        L4e:
            if (r5 != 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            com.forsale.app.features.postad.PostAdViewModel r5 = r11.f36282k0
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = r5.n2()
            if (r5 == 0) goto L5d
            r5.setMediaData(r0, r1)
        L5d:
            com.forsale.app.features.postad.PostAdViewModel r5 = r11.f36282k0
            r5.I4()
            if (r0 == 0) goto L85
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L86
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = android.webkit.URLUtil.isNetworkUrl(r7)
            r7 = r7 ^ r4
            if (r7 == 0) goto L6d
            r5.add(r6)
            goto L6d
        L85:
            r5 = r2
        L86:
            if (r5 == 0) goto L91
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8f
            goto L91
        L8f:
            r0 = r3
            goto L92
        L91:
            r0 = r4
        L92:
            if (r0 != 0) goto La2
            r6 = 0
            r7 = 0
            com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$updateOriginalList$2 r8 = new com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$updateOriginalList$2
            r8.<init>(r11, r2)
            r9 = 3
            r10 = 0
            r5 = r11
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            goto Lcd
        La2:
            if (r1 == 0) goto Lac
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r1)
            r0 = r0 ^ r4
            if (r0 == 0) goto Lac
            goto Lad
        Lac:
            r1 = r2
        Lad:
            if (r1 == 0) goto Lb5
            int r0 = r1.length()
            if (r0 != 0) goto Lb6
        Lb5:
            r3 = r4
        Lb6:
            if (r3 != 0) goto Lc6
            r5 = 0
            r6 = 0
            com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$updateOriginalList$4 r7 = new com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$updateOriginalList$4
            r7.<init>(r11, r2)
            r8 = 3
            r9 = 0
            r4 = r11
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            goto Lcd
        Lc6:
            com.forsale.app.features.postad.PostAdViewModel r0 = r11.f36282k0
            com.forsale.app.features.postad.PostAdScreens r1 = com.forsale.app.features.postad.PostAdScreens.MEDIA_SCREEN
            r0.N1(r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel.h1():void");
    }

    public final void A0(ArrayList<String> imagesToAdd) {
        boolean z11;
        boolean z12;
        int i11;
        int y11;
        int y12;
        o.i(imagesToAdd, "imagesToAdd");
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it2 = imagesToAdd.iterator();
        while (true) {
            z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str = (String) next;
            SnapshotStateList<bf.a> snapshotStateList = this.f36285n0;
            y12 = s.y(snapshotStateList, 10);
            ArrayList arrayList2 = new ArrayList(y12);
            for (bf.a aVar : snapshotStateList) {
                arrayList2.add(aVar.e());
            }
            if (!arrayList2.contains(str)) {
                arrayList.add(next);
            }
        }
        Integer valueOf = Integer.valueOf(this.f36285n0.size());
        if (valueOf.intValue() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (!z12) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = valueOf.intValue() - 1;
        } else {
            i11 = 0;
        }
        SnapshotStateList<bf.a> snapshotStateList2 = this.f36285n0;
        y11 = s.y(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(y11);
        for (String str2 : arrayList) {
            arrayList3.add(new bf.a(str2, null, 2, null));
        }
        if (snapshotStateList2.addAll(arrayList3)) {
            Integer valueOf2 = Integer.valueOf(i11);
            valueOf2.intValue();
            if (this.f36285n0.size() != i11 + 1) {
                z11 = false;
            }
            if (!z11) {
                num = valueOf2;
            }
            if (num != null) {
                this.f36292u0.setValue(Integer.valueOf(num.intValue()));
            }
        }
    }

    public final void B0(String videoUrl) {
        Integer num;
        Job launch$default;
        CategoryRuleSet.MediaConfiguration media;
        CategoryRuleSet.VideoConfiguration video;
        o.i(videoUrl, "videoUrl");
        CategoryRuleSet.RuleSet value = this.f36282k0.d2().getValue();
        if (value != null && (media = value.getMedia()) != null && (video = media.getVideo()) != null) {
            num = Integer.valueOf(video.getMaxSizeKb());
        } else {
            num = null;
        }
        VideoItemViewModel videoItemViewModel = new VideoItemViewModel(videoUrl, null, 2, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault().plus(new c(CoroutineExceptionHandler.Key, this)), null, new PostAdMediaViewModel$addVideo$job$2(this, videoItemViewModel, videoUrl, num, null), 2, null);
        videoItemViewModel.f(launch$default);
    }

    public final SnapshotStateList<bf.a> D0() {
        return this.f36285n0;
    }

    public final LiveData<bf.b> E0() {
        return this.f36289r0;
    }

    public final SharedFlow<k> G0() {
        return this.f36291t0;
    }

    public final PostAdViewModel H0() {
        return this.f36282k0;
    }

    public final k0<Integer> I0() {
        return this.f36292u0;
    }

    public final LiveData<VideoItemViewModel> J0() {
        return this.f36287p0;
    }

    public final void M0() {
        boolean z11;
        LiveData<Boolean> c11;
        this.f36282k0.R3(CreateEditAdvActionType.MEDIA_SCREEN_NEXT_CLICKED, l.b.a.f40030b);
        bf.b value = this.f36289r0.getValue();
        boolean z12 = true;
        boolean z13 = false;
        if (value != null && value.b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            SnapshotStateList<bf.a> snapshotStateList = this.f36285n0;
            if (snapshotStateList != null && !snapshotStateList.isEmpty()) {
                z12 = false;
            }
            if (z12) {
                BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$moveToNextScreen$1(this, null), 3, null);
                return;
            }
        }
        VideoItemViewModel value2 = this.f36287p0.getValue();
        if (value2 != null && (c11 = value2.c()) != null) {
            z13 = o.d(c11.getValue(), Boolean.TRUE);
        }
        if (z13) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$moveToNextScreen$2(this, null), 3, null);
        } else {
            h1();
        }
    }

    public final void N0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), null, new PostAdMediaViewModel$onAddImagesClicked$1(this, i11, null), 2, null);
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_CAPTURE_MEDIA_CLICKED, PLFMediaTypes.IMAGE, null, false, 12, null);
    }

    public final void O0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$onAddVideoClicked$1(this, null), 3, null);
        if (z11) {
            PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_REPLACE_VIDEO_CLICKED, null, null, false, 14, null);
        } else {
            PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_CAPTURE_MEDIA_CLICKED, PLFMediaTypes.VIDEO, null, false, 12, null);
        }
    }

    public final void Q0(boolean z11) {
        l.a aVar;
        if (z11) {
            aVar = l.a.b.f40029b;
        } else {
            aVar = l.a.C0455a.f40028b;
        }
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_CANCEL_CLICKED, null, aVar, false, 2, null);
    }

    public final void S0(bf.a imageItemViewModel) {
        o.i(imageItemViewModel, "imageItemViewModel");
        this.f36285n0.remove(imageItemViewModel);
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_DELETE_MEDIA_CLICKED, PLFMediaTypes.IMAGE, null, false, 12, null);
    }

    public final void T0() {
        VideoItemViewModel value = this.f36287p0.getValue();
        if (value != null) {
            g1(value);
            ListingDetailsEntity n22 = this.f36282k0.n2();
            if (n22 != null) {
                n22.deleteVideo();
            }
        }
        this.f36286o0.postValue(null);
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_DELETE_MEDIA_CLICKED, PLFMediaTypes.VIDEO, null, false, 12, null);
    }

    public final void U0(bf.a imageItemViewModel) {
        o.i(imageItemViewModel, "imageItemViewModel");
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), null, new PostAdMediaViewModel$onEditImageClicked$1(this, imageItemViewModel, null), 2, null);
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_EDIT_MEDIA_CLICKED, null, null, false, 14, null);
    }

    public final void V0(String newImageUrl) {
        o.i(newImageUrl, "newImageUrl");
        bf.a aVar = this.f36293v0;
        if (aVar != null) {
            int indexOf = this.f36285n0.indexOf(aVar);
            this.f36285n0.set(indexOf, bf.a.b(aVar, newImageUrl, null, 2, null));
            this.f36292u0.setValue(Integer.valueOf(indexOf));
        }
    }

    public final void W0() {
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_ACTIONS_CLICKED, PLFMediaTypes.IMAGE, null, false, 12, null);
    }

    public final void X0() {
        PostAdViewModel.P3(this.f36282k0, CreateEditAdvActionType.MEDIA_SCREEN_ACTIONS_CLICKED, PLFMediaTypes.VIDEO, null, false, 12, null);
    }

    public final void Y0(bf.a itemViewModel) {
        o.i(itemViewModel, "itemViewModel");
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), null, new PostAdMediaViewModel$onViewImageClicked$1(this, itemViewModel, null), 2, null);
    }

    public final void Z0(VideoItemViewModel mediaModel) {
        o.i(mediaModel, "mediaModel");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$onViewVideo$1(this, mediaModel, null), 3, null);
    }

    public final void b1(MediaStates mediaState) {
        boolean z11;
        MediaStates mediaStates;
        o.i(mediaState, "mediaState");
        if (mediaState != MediaStates.INITIAL) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            mediaStates = mediaState;
        } else {
            mediaStates = null;
        }
        if (mediaStates != null) {
            int i11 = b.f36301a[mediaState.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    L0();
                    return;
                }
                return;
            }
            K0();
        }
    }

    public final void c1() {
        this.f36282k0.B4(false);
        f1();
    }

    public final void d1(b10.a fromPos, b10.a toPos) {
        o.i(fromPos, "fromPos");
        o.i(toPos, "toPos");
        b10.b.a(this.f36285n0, fromPos.a(), toPos.a());
    }

    public final void e1(bf.a aVar) {
        this.f36293v0 = aVar;
    }

    public final void i1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$uploadImagesInForeGround$1(this, null), 3, null);
    }

    public final void j1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdMediaViewModel$uploadVideoInBackground$1(this, null), 3, null);
    }
}
