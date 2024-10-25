package com.forsale.app.features.webBrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.result.ActivityResult;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.l;
import j0.d1;
import j0.k0;
import j0.v0;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
/* compiled from: WebView.kt */
/* loaded from: classes2.dex */
public final class WebViewKt {

    /* compiled from: WebView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.a<p> f37094a;

        a(g00.a<p> aVar) {
            this.f37094a = aVar;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            o.i(view, "view");
            o.i(url, "url");
            this.f37094a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        final int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(1710418896);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(1710418896, i12, -1, "com.forsale.app.features.webBrowser.CameraPermissionDialog (WebView.kt:240)");
            }
            final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        aVar.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            r0.a b11 = b.b(h11, -1960007544, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    if ((i14 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1960007544, i14, -1, "com.forsale.app.features.webBrowser.CameraPermissionDialog.<anonymous> (WebView.kt:249)");
                    }
                    final Context context2 = context;
                    final g00.a<p> aVar5 = aVar;
                    ButtonsKt.d(new g00.a<p>() { // from class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                            context2.startActivity(intent);
                            aVar5.invoke();
                        }
                    }, null, null, null, null, null, null, false, null, null, ComposableSingletons$WebViewKt.f37032a.a(), aVar4, 0, 6, 1022);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
            r0.a b12 = b.b(h11, 2002316614, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r2v3 */
                public final void b(a aVar4, int i14) {
                    if ((i14 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(2002316614, i14, -1, "com.forsale.app.features.webBrowser.CameraPermissionDialog.<anonymous> (WebView.kt:259)");
                    }
                    final g00.a<p> aVar5 = aVar;
                    aVar4.C(1157296644);
                    boolean T2 = aVar4.T(aVar5);
                    Object D2 = aVar4.D();
                    if (T2 || D2 == a.f7182a.a()) {
                        D2 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR  (r2v2 'D2' java.lang.Object) = (r0v1 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r11 = r17
                            r0 = r18
                            r1 = r0 & 11
                            r2 = 2
                            if (r1 != r2) goto L16
                            boolean r1 = r17.i()
                            if (r1 != 0) goto L10
                            goto L16
                        L10:
                            r17.L()
                            r15 = r16
                            goto L70
                        L16:
                            boolean r1 = androidx.compose.runtime.c.I()
                            if (r1 == 0) goto L25
                            r1 = -1
                            java.lang.String r2 = "com.forsale.app.features.webBrowser.CameraPermissionDialog.<anonymous> (WebView.kt:259)"
                            r3 = 2002316614(0x7758ed46, float:4.3997992E33)
                            androidx.compose.runtime.c.U(r3, r0, r1, r2)
                        L25:
                            r15 = r16
                            g00.a<wz.p> r0 = r1
                            r1 = 1157296644(0x44faf204, float:2007.563)
                            r11.C(r1)
                            boolean r1 = r11.T(r0)
                            java.lang.Object r2 = r17.D()
                            if (r1 != 0) goto L41
                            androidx.compose.runtime.a$a r1 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r1 = r1.a()
                            if (r2 != r1) goto L49
                        L41:
                            com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3$1$1 r2 = new com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3$1$1
                            r2.<init>(r0)
                            r11.u(r2)
                        L49:
                            r17.S()
                            r0 = r2
                            g00.a r0 = (g00.a) r0
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r9 = 0
                            com.forsale.app.features.webBrowser.ComposableSingletons$WebViewKt r10 = com.forsale.app.features.webBrowser.ComposableSingletons$WebViewKt.f37032a
                            g00.q r10 = r10.b()
                            r12 = 0
                            r13 = 6
                            r14 = 1022(0x3fe, float:1.432E-42)
                            r11 = r17
                            com.forsale.designSystem.buttons.ButtonsKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L70
                            androidx.compose.runtime.c.T()
                        L70:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$3.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                });
                ComposableSingletons$WebViewKt composableSingletons$WebViewKt = ComposableSingletons$WebViewKt.f37032a;
                aVar3 = h11;
                AndroidAlertDialog_androidKt.a((g00.a) D, b11, null, b12, composableSingletons$WebViewKt.c(), composableSingletons$WebViewKt.d(), null, 0L, 0L, null, h11, 224304, 964);
                if (c.I()) {
                    c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.webBrowser.WebViewKt$CameraPermissionDialog$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar4, int i14) {
                        WebViewKt.a(aVar, aVar4, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x02be  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x037c  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x039b  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0431  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void b(androidx.compose.ui.c r30, final java.lang.String r31, g00.l<? super android.webkit.WebSettings, wz.p> r32, boolean r33, boolean r34, boolean r35, g00.a<wz.p> r36, g00.a<wz.p> r37, hf.a r38, g00.l<? super android.webkit.ConsoleMessage, java.lang.Boolean> r39, androidx.compose.runtime.a r40, final int r41, final int r42) {
            /*
                Method dump skipped, instructions count: 1118
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.webBrowser.WebViewKt.b(androidx.compose.ui.c, java.lang.String, g00.l, boolean, boolean, boolean, g00.a, g00.a, hf.a, g00.l, androidx.compose.runtime.a, int, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(k0<Boolean> k0Var) {
            return k0Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(k0<Boolean> k0Var, boolean z11) {
            k0Var.setValue(Boolean.valueOf(z11));
        }

        private static final boolean e(k0<Boolean> k0Var) {
            return k0Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(k0<Boolean> k0Var, boolean z11) {
            k0Var.setValue(Boolean.valueOf(z11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Intent p(Context context, WebChromeClient.FileChooserParams fileChooserParams, l<? super Uri, p> lVar) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            String[] acceptTypes;
            boolean J;
            String[] acceptTypes2;
            boolean J2;
            String[] acceptTypes3;
            boolean J3;
            Boolean bool6;
            String[] acceptTypes4;
            boolean J4;
            Boolean bool7;
            String[] acceptTypes5;
            boolean J5;
            Uri uri = null;
            if (fileChooserParams != null) {
                bool = Boolean.valueOf(fileChooserParams.isCaptureEnabled());
            } else {
                bool = null;
            }
            if (s(bool)) {
                if (fileChooserParams != null && (acceptTypes5 = fileChooserParams.getAcceptTypes()) != null) {
                    J5 = ArraysKt___ArraysKt.J(acceptTypes5, "image/*");
                    bool7 = Boolean.valueOf(J5);
                } else {
                    bool7 = null;
                }
                if (s(bool7)) {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    Uri q11 = q(context);
                    if (q11 != null) {
                        lVar.invoke(q11);
                        uri = q11;
                    }
                    intent.putExtra("output", uri);
                    return intent;
                }
            }
            if (fileChooserParams != null) {
                bool2 = Boolean.valueOf(fileChooserParams.isCaptureEnabled());
            } else {
                bool2 = null;
            }
            if (s(bool2)) {
                if (fileChooserParams != null && (acceptTypes4 = fileChooserParams.getAcceptTypes()) != null) {
                    J4 = ArraysKt___ArraysKt.J(acceptTypes4, "video/*");
                    bool6 = Boolean.valueOf(J4);
                } else {
                    bool6 = null;
                }
                if (s(bool6)) {
                    return new Intent("android.media.action.VIDEO_CAPTURE");
                }
            }
            if (fileChooserParams != null && (acceptTypes3 = fileChooserParams.getAcceptTypes()) != null) {
                J3 = ArraysKt___ArraysKt.J(acceptTypes3, "image/*");
                bool3 = Boolean.valueOf(J3);
            } else {
                bool3 = null;
            }
            if (s(bool3)) {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                return intent2;
            }
            if (fileChooserParams != null && (acceptTypes2 = fileChooserParams.getAcceptTypes()) != null) {
                J2 = ArraysKt___ArraysKt.J(acceptTypes2, "video/*");
                bool4 = Boolean.valueOf(J2);
            } else {
                bool4 = null;
            }
            if (s(bool4)) {
                Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                intent3.addCategory("android.intent.category.OPENABLE");
                intent3.setType("video/*");
                return intent3;
            }
            if (fileChooserParams != null && (acceptTypes = fileChooserParams.getAcceptTypes()) != null) {
                J = ArraysKt___ArraysKt.J(acceptTypes, ".pdf");
                bool5 = Boolean.valueOf(J);
            } else {
                bool5 = null;
            }
            if (s(bool5)) {
                Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
                intent4.addCategory("android.intent.category.OPENABLE");
                intent4.setType("application/pdf");
                return intent4;
            }
            x10.a.b("No Valid file chooser type", new Object[0]);
            return null;
        }

        private static final Uri q(Context context) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date());
            o.h(format, "format(...)");
            String str = "JPEG_" + format + "_";
            File cacheDir = context.getCacheDir();
            o.h(cacheDir, "getCacheDir(...)");
            try {
                return FileProvider.g(context, context.getPackageName() + ".provider", File.createTempFile(str, ".jpg", cacheDir));
            } catch (IOException e11) {
                x10.a.d(e11, "Failed to create file for camera intent", new Object[0]);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ActivityResult activityResult, k0<ValueCallback<Uri[]>> k0Var, k0<Uri> k0Var2) {
            Uri value;
            Intent a11 = activityResult.a();
            if (a11 == null || (value = a11.getData()) == null) {
                value = k0Var2.getValue();
            }
            if (activityResult.b() == -1 && value != null) {
                ValueCallback<Uri[]> value2 = k0Var.getValue();
                if (value2 != null) {
                    value2.onReceiveValue(new Uri[]{value});
                }
            } else {
                ValueCallback<Uri[]> value3 = k0Var.getValue();
                if (value3 != null) {
                    value3.onReceiveValue(null);
                }
            }
            k0Var.setValue(null);
            k0Var2.setValue(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s(Boolean bool) {
            return o.d(bool, Boolean.TRUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean t(Context context, boolean z11, boolean z12, g00.a<p> aVar, l<? super Exception, p> lVar, g00.a<p> aVar2, g00.a<p> aVar3, g00.a<p> aVar4) {
            try {
                if (z11) {
                    if (androidx.core.content.b.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
                        aVar4.invoke();
                    } else {
                        aVar2.invoke();
                        o.g(context, "null cannot be cast to non-null type android.app.Activity");
                        if (!androidx.core.app.b.k((Activity) context, "android.permission.CAMERA") && z12) {
                            aVar.invoke();
                        }
                        aVar3.invoke();
                    }
                } else {
                    aVar4.invoke();
                }
                return true;
            } catch (Exception e11) {
                lVar.invoke(e11);
                aVar2.invoke();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(k0<ValueCallback<Uri[]>> k0Var) {
            ValueCallback<Uri[]> value = k0Var.getValue();
            if (value != null) {
                value.onReceiveValue(null);
            }
            k0Var.setValue(null);
        }
    }
