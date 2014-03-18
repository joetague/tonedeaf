(ns tonedeaf.core)

(definst beep [note 60] 
  (let [src (sin-osc (midicps note)) 
  env (env-perc 0.01 1.0 :action :free)] 
  (* src env)))
